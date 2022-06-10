package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.VehicleStatus;
import com.gu.yanzhao.services.VehicleStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class VehicleStatusController {

    @Autowired
    private VehicleStatusService vehicleStatusService;

    @GetMapping("/vehicleStatus")
    public String goVehicleStatus(Model model) {
        model.addAttribute("vehicleStatuss",vehicleStatusService.getVehicleStatus());
        return "VehicleStatus";
    }

    @PostMapping("/vehicleStatus/add")
    public String addVehicleStatus(VehicleStatus vehicleStatus) {
        vehicleStatusService.save(vehicleStatus);
        return "redirect:/vehicleStatus";
    }

    @RequestMapping("vehicleStatus/findById")
    @ResponseBody
    public Optional<VehicleStatus> findById(Integer id) {
        return vehicleStatusService.findById(id);
    }

    @RequestMapping("/vehicleStatus/update")
    public String update(VehicleStatus vehicleStatus) {
        vehicleStatusService.save(vehicleStatus);
        return "redirect:/vehicleStatus";
    }

    @RequestMapping("/vehicleStatus/delete")
    public String delete(Integer id) {
        vehicleStatusService.delete(id);
        return "redirect:/vehicleStatus";
    }
}
