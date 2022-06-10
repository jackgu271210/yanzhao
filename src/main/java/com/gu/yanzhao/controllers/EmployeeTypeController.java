package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.EmployeeType;
import com.gu.yanzhao.services.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class EmployeeTypeController {

    @Autowired
    private EmployeeTypeService employeeTypeService;

    @GetMapping("/employeeType")
    public String goEmployeeType(Model model) {
        model.addAttribute("employeeTypes",employeeTypeService.getEmployeeType());
        return "EmployeeType";
    }

    @PostMapping("/employeeType/add")
    public String addEmployeeType(EmployeeType employeeType) {
        employeeTypeService.save(employeeType);
        return "redirect:/employeeType";
    }

    @RequestMapping("employeeType/findById")
    @ResponseBody
    public Optional<EmployeeType> findById(Integer id) {
        return employeeTypeService.findById(id);
    }

    @RequestMapping("/employeeType/update")
    public String update(EmployeeType employeeType) {
        employeeTypeService.save(employeeType);
        return "redirect:/employeeType";
    }

    @RequestMapping("/employeeType/delete")
    public String delete(Integer id) {
        employeeTypeService.delete(id);
        return "redirect:/employeeType";
    }
}
