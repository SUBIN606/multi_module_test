package rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.api.service.UserService;

@RestController
public class WebController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return userService.findAllUsers().toString();
    }

}
