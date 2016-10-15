package io.luminara.uservices.scnoss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Lab1Controller {

    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
