package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Supplier;
import com.gu.yanzhao.services.SupplierService;
import com.gu.yanzhao.services.CountryService;
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
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/supplier")
    public String goSupplier(Model model) {
        model.addAttribute("suppliers",supplierService.getSupplier());
        model.addAttribute("countries",countryService.getCountry());
        model.addAttribute("states",stateService.getState());
        return "Supplier";
    }

    @PostMapping("/supplier/add")
    public String addSupplier(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/supplier";
    }

    @RequestMapping("supplier/findById")
    @ResponseBody
    public Optional<Supplier> findById(Integer id) {
        return supplierService.findById(id);
    }

    @RequestMapping("/supplier/update")
    public String update(Supplier supplier) {
        supplierService.save(supplier);
        return "redirect:/supplier";
    }

    @RequestMapping("/supplier/delete")
    public String delete(Integer id) {
        supplierService.delete(id);
        return "redirect:/supplier";
    }
}
