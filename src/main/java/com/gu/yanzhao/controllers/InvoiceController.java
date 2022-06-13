package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Invoice;
import com.gu.yanzhao.services.ClientService;
import com.gu.yanzhao.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private ClientService clientService;

    @GetMapping("/invoice")
    public String goInvoice(Model model) {
        model.addAttribute("invoices",invoiceService.getInvoice());
        model.addAttribute("clients",clientService.getClient());
        return "Invoice";
    }

    @PostMapping("/invoice/add")
    public String addInvoice(Invoice invoice) {
        invoiceService.save(invoice);
        return "redirect:/invoice";
    }

    @RequestMapping("invoice/findById")
    @ResponseBody
    public Optional<Invoice> findById(Integer id) {
        return invoiceService.findById(id);
    }

    @RequestMapping("/invoice/update")
    public String update(Invoice invoice) {
        invoiceService.save(invoice);
        return "redirect:/invoice";
    }

    @RequestMapping("/invoice/delete")
    public String delete(Integer id) {
        invoiceService.delete(id);
        return "redirect:/invoice";
    }
}
