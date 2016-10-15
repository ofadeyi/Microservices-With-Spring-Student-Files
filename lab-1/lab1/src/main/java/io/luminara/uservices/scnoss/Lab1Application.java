package io.luminara.uservices.scnoss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.*;

@SpringBootApplication
public class Lab1Application {

	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<>();
		players.add(new Player("player1", "keeper"));
		players.add(new Player("player2", "defender"));
		players.add(new Player("player3", "midfield"));
		players.add(new Player("player4", "striker"));
		List<Team> teams =  Arrays.asList(new Team("Globetrotters", "Harlem", "", players),
				new Team("Generals", "Washington", ""));

		teamRepository.save(teams);
	}
}
