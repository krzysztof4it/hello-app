package pl.krzysztof4it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Krzysztof on 2017-08-22.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "Hello :) ";
    }
}
