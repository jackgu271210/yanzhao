package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Location;
import com.gu.yanzhao.services.CountryService;
import com.gu.yanzhao.services.LocationService;
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
public class LocationController {

    @Autowired
    private LocationService locationService;
    
    @Autowired
    private StateService stateService;
    
    @Autowired
    private CountryService countryService;

    @GetMapping("/location")
    public String goLocation(Model model) {
        model.addAttribute("locations",locationService.getLocation());
        model.addAttribute("states",stateService.getState());
        model.addAttribute("countries",countryService.getCountry());
        return "Location";
    }

    @PostMapping("/location/add")
    public String addLocation(Location location) {
        locationService.save(location);
        return "redirect:/location";
    }

    @RequestMapping("location/findById")
    @ResponseBody
    public Optional<Location> findById(Integer id) {
        return locationService.findById(id);
    }

    @RequestMapping("/location/update")
    public String update(Location location) {
        locationService.save(location);
        return "redirect:/location";
    }

    @RequestMapping("/location/delete")
    public String delete(Integer id) {
        locationService.delete(id);
        return "redirect:/location";
    }
}

