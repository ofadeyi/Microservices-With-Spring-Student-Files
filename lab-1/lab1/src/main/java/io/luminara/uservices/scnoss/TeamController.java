package io.luminara.uservices.scnoss;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ofadeyi.
 */
@RestController
public class TeamController {

    @RequestMapping("/teams")
    public List<Team> retrieveTeams(){
        return Arrays.asList(new Team(0l,"Globetrotters", "Harlem", ""),
                new Team(1l,"Generals", "Washington", ""));
    }
}
