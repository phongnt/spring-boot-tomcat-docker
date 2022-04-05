package com.github.phongnt.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VulnerableController {

    @RequestMapping("/vulnerable")
    public String vulnerable(User user) {
        return String.format("{\"message\":\"Hello, %s\"}", user.getName());
    }

}
