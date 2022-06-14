package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Contact;
import com.gu.yanzhao.services.ContactService;
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
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/contact")
    public String goContact(Model model) {
        model.addAttribute("contacts",contactService.getContact());
        model.addAttribute("countries",countryService.getCountry());
        model.addAttribute("states",stateService.getState());
        return "Contact";
    }

    @PostMapping("/contact/add")
    public String addContact(Contact contact) {
        contactService.save(contact);
        return "redirect:/contact";
    }

    @RequestMapping("contact/findById")
    @ResponseBody
    public Optional<Contact> findById(Integer id) {
        return contactService.findById(id);
    }

    @RequestMapping("/contact/update")
    public String update(Contact contact) {
        contactService.save(contact);
        return "redirect:/contact";
    }

    @RequestMapping("/contact/delete")
    public String delete(Integer id) {
        contactService.delete(id);
        return "redirect:/contact";
    }
}
