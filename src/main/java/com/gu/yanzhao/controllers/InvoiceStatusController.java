package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.InvoiceStatus;
import com.gu.yanzhao.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class InvoiceStatusController {

    @Autowired
    private InvoiceStatusService invoiceStatusService;

    @GetMapping("/invoiceStatus")
    public String goInvoiceStatus(Model model) {
        model.addAttribute("invoiceStatuss",invoiceStatusService.getInvoiceStatus());
        return "InvoiceStatus";
    }

    @PostMapping("/invoiceStatus/add")
    public String addInvoiceStatus(InvoiceStatus invoiceStatus) {
        invoiceStatusService.save(invoiceStatus);
        return "redirect:/invoiceStatus";
    }

    @RequestMapping("invoiceStatus/findById")
    @ResponseBody
    public Optional<InvoiceStatus> findById(Integer id) {
        return invoiceStatusService.findById(id);
    }

    @RequestMapping("/invoiceStatus/update")
    public String update(InvoiceStatus invoiceStatus) {
        invoiceStatusService.save(invoiceStatus);
        return "redirect:/invoiceStatus";
    }

    @RequestMapping("/invoiceStatus/delete")
    public String delete(Integer id) {
        invoiceStatusService.delete(id);
        return "redirect:/invoiceStatus";
    }
}
