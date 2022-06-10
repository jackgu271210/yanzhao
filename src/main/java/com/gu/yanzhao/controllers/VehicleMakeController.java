package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.VehicleMake;
import com.gu.yanzhao.services.CountryService;
import com.gu.yanzhao.services.VehicleMakeService;
import com.gu.yanzhao.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class VehicleMakeController {

    @Autowired
    private VehicleMakeService vehicleMakeService;

    @GetMapping("/vehicleMake")
    public String goVehicleMake(Model model) {
        model.addAttribute("vehicleMakes",vehicleMakeService.getVehicleMake());
        return "VehicleMake";
    }

    @PostMapping("/vehicleMake/add")
    public String addVehicleMake(VehicleMake vehicleMake) {
        vehicleMakeService.save(vehicleMake);
        return "redirect:/vehicleMake";
    }

    @RequestMapping("vehicleMake/findById")
    @ResponseBody
    public Optional<VehicleMake> findById(Integer id) {
        return vehicleMakeService.findById(id);
    }

    @RequestMapping("/vehicleMake/update")
    public String update(VehicleMake vehicleMake) {
        vehicleMakeService.save(vehicleMake);
        return "redirect:/vehicleMake";
    }

    @RequestMapping("/vehicleMake/delete")
    public String delete(Integer id) {
        vehicleMakeService.delete(id);
        return "redirect:/vehicleMake";
    }
}
