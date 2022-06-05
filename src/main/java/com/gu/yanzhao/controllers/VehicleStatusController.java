package com.gu.yanzhao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {

    @GetMapping("/vehicleStatus")
    public String goVehicleStatus() {
        return "VehicleStatus";
    }
}
