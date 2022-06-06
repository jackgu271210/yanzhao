package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Country;
import com.gu.yanzhao.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
public class CountryController {
    
    @Autowired
    private CountryService countryService;
    
    @GetMapping("/country")
    public String goCountry(Model model) {
        List<Country> countryList = countryService.getCountry(); 
        model.addAttribute("countries",countryList);
        return "Country";
    }
    
    @PostMapping("/country/add")
    public String addCountry(Country country) {
        countryService.save(country);
        return "redirect:/country";
    }
    
    @RequestMapping("country/findById")
    @ResponseBody
    public Optional<Country> findById(Integer id) {
        return countryService.findById(id);
    }
}
