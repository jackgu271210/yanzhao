package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.VehicleType;
import com.gu.yanzhao.services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class VehicleTypeController {

    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping("/vehicleType")
    public String goVehicleType(Model model) {
        model.addAttribute("vehicleTypes",vehicleTypeService.getVehicleType());
        return "VehicleType";
    }

    @PostMapping("/vehicleType/add")
    public String addVehicleType(VehicleType vehicleType) {
        vehicleTypeService.save(vehicleType);
        return "redirect:/vehicleType";
    }

    @RequestMapping("vehicleType/findById")
    @ResponseBody
    public Optional<VehicleType> findById(Integer id) {
        return vehicleTypeService.findById(id);
    }

    @RequestMapping("/vehicleType/update")
    public String update(VehicleType vehicleType) {
        vehicleTypeService.save(vehicleType);
        return "redirect:/vehicleType";
    }

    @RequestMapping("/vehicleType/delete")
    public String delete(Integer id) {
        vehicleTypeService.delete(id);
        return "redirect:/vehicleType";
    }
}
