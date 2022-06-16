package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Employee;
import com.gu.yanzhao.models.JobTitle;
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
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private JobTitleService jobTitleService;

    @Autowired
    private EmployeeTypeService employeeTypeService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/employee")
    public String goEmployee(Model model) {
        model.addAttribute("employees",employeeService.getEmployee());
        model.addAttribute("jobTitles",jobTitleService.getJobTitle());
        model.addAttribute("employeeTypes",employeeTypeService.getEmployeeType());
        model.addAttribute("countries",countryService.getCountry());
        model.addAttribute("states",stateService.getState());
        return "Employee";
    }

    @PostMapping("/employee/add")
    public String addEmployee(Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping("employee/findById")
    @ResponseBody
    public Optional<Employee> findById(Integer id) {
        return employeeService.findById(id);
    }

    @RequestMapping("/employee/update")
    public String update(Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping("/employee/delete")
    public String delete(Integer id) {
        employeeService.delete(id);
        return "redirect:/employee";
    }
}
