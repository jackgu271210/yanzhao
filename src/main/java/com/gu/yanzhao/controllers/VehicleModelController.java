package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.VehicleModel;
import com.gu.yanzhao.services.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class VehicleModelController {

    @Autowired
    private VehicleModelService vehicleModelService;

    @GetMapping("/vehicleModel")
    public String goVehicleModel(Model model) {
        model.addAttribute("vehicleModels",vehicleModelService.getVehicleModel());
        return "VehicleModel";
    }

    @PostMapping("/vehicleModel/add")
    public String addVehicleModel(VehicleModel vehicleModel) {
        vehicleModelService.save(vehicleModel);
        return "redirect:/vehicleModel";
    }

    @RequestMapping("vehicleModel/findById")
    @ResponseBody
    public Optional<VehicleModel> findById(Integer id) {
        return vehicleModelService.findById(id);
    }

    @RequestMapping("/vehicleModel/update")
    public String update(VehicleModel vehicleModel) {
        vehicleModelService.save(vehicleModel);
        return "redirect:/vehicleModel";
    }

    @RequestMapping("/vehicleModel/delete")
    public String delete(Integer id) {
        vehicleModelService.delete(id);
        return "redirect:/vehicleModel";
    }
}
