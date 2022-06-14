package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.VehicleMaintenance;
import com.gu.yanzhao.services.SupplierService;
import com.gu.yanzhao.services.VehicleMaintenanceService;
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
public class VehicleMaintenanceController {

    @Autowired
    private VehicleMaintenanceService vehicleMaintenanceService;

    @Autowired
    private VehicleService vehicleService;
    
    @Autowired
    private SupplierService supplierService;

    @GetMapping("/vehicleMaintenance")
    public String goVehicleMaintenance(Model model) {
        model.addAttribute("vehicleMaintenances",vehicleMaintenanceService.getVehicleMaintenance());
        model.addAttribute("vehicles", vehicleService.getVehicle());
        model.addAttribute("suppliers", supplierService.getSupplier());
        return "VehicleMaintenance";
    }

    @PostMapping("/vehicleMaintenance/add")
    public String addVehicleMaintenance(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceService.save(vehicleMaintenance);
        return "redirect:/vehicleMaintenance";
    }

    @RequestMapping("vehicleMaintenance/findById")
    @ResponseBody
    public Optional<VehicleMaintenance> findById(Integer id) {
        return vehicleMaintenanceService.findById(id);
    }

    @RequestMapping("/vehicleMaintenance/update")
    public String update(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceService.save(vehicleMaintenance);
        return "redirect:/vehicleMaintenance";
    }

    @RequestMapping("/vehicleMaintenance/delete")
    public String delete(Integer id) {
        vehicleMaintenanceService.delete(id);
        return "redirect:/vehicleMaintenance";
    }
}
