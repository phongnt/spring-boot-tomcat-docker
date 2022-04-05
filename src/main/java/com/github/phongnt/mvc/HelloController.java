package com.github.phongnt.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String handler(Model model, @RequestParam(value = "name") String name) {
        model.addAttribute("name", name);
        return "index";
    }

}
