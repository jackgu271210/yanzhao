package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.State;
import com.gu.yanzhao.services.CountryService;
import com.gu.yanzhao.services.StateService;
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
public class StateController {

    @Autowired
    private StateService stateService;
    
    @Autowired
    private CountryService countryService;

    @GetMapping("/state")
    public String goState(Model model) {
        model.addAttribute("states",stateService.getState());
        model.addAttribute("countries",countryService.getCountry());
        return "State";
    }

    @PostMapping("/state/add")
    public String addState(State state) {
        stateService.save(state);
        return "redirect:/state";
    }

    @RequestMapping("state/findById")
    @ResponseBody
    public Optional<State> findById(Integer id) {
        return stateService.findById(id);
    }

    @RequestMapping("/state/update")
    public String update(State state) {
        stateService.save(state);
        return "redirect:/state";
    }

    @RequestMapping("/state/delete")
    public String delete(Integer id) {
        stateService.delete(id);
        return "redirect:/state";
    }
}
