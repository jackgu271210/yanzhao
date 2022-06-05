package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Country;
import com.gu.yanzhao.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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
}
