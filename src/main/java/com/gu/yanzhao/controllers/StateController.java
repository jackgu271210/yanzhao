package com.gu.yanzhao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateController {

    @GetMapping("/state")
    public String goState() {
        return "State";
    }
}
