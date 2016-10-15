package io.luminara.uservices.scnoss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Lab1Application {

	@Autowired
	TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}

	@PostConstruct
	public void init(){
		List<Team> teams =  Arrays.asList(new Team("Globetrotters", "Harlem", ""),
				new Team("Generals", "Washington", ""));

		teamRepository.save(teams);
	}
}
