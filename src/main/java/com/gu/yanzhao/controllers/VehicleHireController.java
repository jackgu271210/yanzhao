package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.VehicleHire;
import com.gu.yanzhao.services.ClientService;
import com.gu.yanzhao.services.LocationService;
import com.gu.yanzhao.services.VehicleHireService;
import com.gu.yanzhao.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class VehicleHireController {

    @Autowired
    private VehicleHireService vehicleHireService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private ClientService clientService;

    @GetMapping("/vehicleHire")
    public String goVehicleHire(Model model) {
        model.addAttribute("vehicleHires",vehicleHireService.getVehicleHire());
        model.addAttribute("vehicles",vehicleService.getVehicle());
        model.addAttribute("locations",locationService.getLocation());
        model.addAttribute("clients",clientService.getClient());
        return "VehicleHire";
    }

    @PostMapping("/vehicleHire/add")
    public String addVehicleHire(VehicleHire vehicleHire) {
        vehicleHireService.save(vehicleHire);
        return "redirect:/vehicleHire";
    }

    @RequestMapping("vehicleHire/findById")
    @ResponseBody
    public Optional<VehicleHire> findById(Integer id) {
        return vehicleHireService.findById(id);
    }

    @RequestMapping("/vehicleHire/update")
    public String update(VehicleHire vehicleHire) {
        vehicleHireService.save(vehicleHire);
        return "redirect:/vehicleHire";
    }

    @RequestMapping("/vehicleHire/delete")
    public String delete(Integer id) {
        vehicleHireService.delete(id);
        return "redirect:/vehicleHire";
    }
}
