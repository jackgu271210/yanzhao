package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.Client;
import com.gu.yanzhao.services.CountryService;
import com.gu.yanzhao.services.ClientService;
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
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @GetMapping("/client")
    public String goClient(Model model) {
        model.addAttribute("clients",clientService.getClient());
        model.addAttribute("countries",countryService.getCountry());
        model.addAttribute("states",stateService.getState());
        return "Client";
    }

    @PostMapping("/client/add")
    public String addClient(Client client) {
        clientService.save(client);
        return "redirect:/client";
    }

    @RequestMapping("client/findById")
    @ResponseBody
    public Optional<Client> findById(Integer id) {
        return clientService.findById(id);
    }

    @RequestMapping("/client/update")
    public String update(Client client) {
        clientService.save(client);
        return "redirect:/client";
    }

    @RequestMapping("/client/delete")
    public String delete(Integer id) {
        clientService.delete(id);
        return "redirect:/client";
    }
}
