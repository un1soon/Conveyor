package ru.neoflex.Conveyor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/conveyor")
public class ConveyorController {

    @ResponseBody
    @PostMapping("/offers")
    public String offer() {
        return "";
    }
}
