package io.luminara.uservices.scnoss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ofadeyi.
 */
@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> retrieveTeams(){
        return teamRepository.findAll();
    }

    @RequestMapping("/teams/{id}")
    public Team retrieveTeam(@PathVariable long id){
        return teamRepository.findOne(id);
    }
}
