package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Vehicle;
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
public class VehicleController {
    
    //Location
    //Employee
    //Vehicle Make
    //Vehicle Status
    //Vehicle Type
    //Vehicle Model
    //Vehicles
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private VehicleMakeService vehicleMakeService;

    @Autowired
    private VehicleStatusService vehicleStatusService;

    @Autowired
    private VehicleTypeService vehicleTypeService;

    @Autowired
    private VehicleModelService vehicleModelService;

    @GetMapping("/vehicle")
    public String goVehicle(Model model) {
        model.addAttribute("vehicles",vehicleService.getVehicle());
        model.addAttribute("locations",locationService.getLocation());
        model.addAttribute("employees",employeeService.getEmployee());
        model.addAttribute("vehicleMakes",vehicleMakeService.getVehicleMake());
        model.addAttribute("vehicleStatuses",vehicleStatusService.getVehicleStatus());
        model.addAttribute("vehicleTypes",vehicleTypeService.getVehicleType());
        model.addAttribute("vehicleModels",vehicleModelService.getVehicleModel());
        return "Vehicle";
    }

    @PostMapping("/vehicle/add")
    public String addVehicle(Vehicle vehicle) {
        vehicleService.save(vehicle);
        return "redirect:/vehicle";
    }

    @RequestMapping("vehicle/findById")
    @ResponseBody
    public Optional<Vehicle> findById(Integer id) {
        return vehicleService.findById(id);
    }

    @RequestMapping("/vehicle/update")
    public String update(Vehicle vehicle) {
        vehicleService.save(vehicle);
        return "redirect:/vehicle";
    }

    @RequestMapping("/vehicle/delete")
    public String delete(Integer id) {
        vehicleService.delete(id);
        return "redirect:/vehicle";
    }
}
