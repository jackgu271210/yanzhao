package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.VehicleMovement;
import com.gu.yanzhao.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class VehicleMovementController {

    @Autowired
    private VehicleMovementService vehicleMovementService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/vehicleMovement")
    public String goVehicleMovement(Model model) {
        model.addAttribute("vehicleMovements",vehicleMovementService.getVehicleMovement());
        model.addAttribute("vehicles",vehicleService.getVehicle());
        model.addAttribute("locations",locationService.getLocation());
        return "VehicleMovement";
    }

    @PostMapping("/vehicleMovement/add")
    public String addVehicleMovement(VehicleMovement vehicleMovement) {
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovement";
    }

    @RequestMapping("vehicleMovement/findById")
    @ResponseBody
    public Optional<VehicleMovement> findById(Integer id) {
        return vehicleMovementService.findById(id);
    }

    @RequestMapping("/vehicleMovement/update")
    public String update(VehicleMovement vehicleMovement) {
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovement";
    }

    @RequestMapping("/vehicleMovement/delete")
    public String delete(Integer id) {
        vehicleMovementService.delete(id);
        return "redirect:/vehicleMovement";
    }
}
