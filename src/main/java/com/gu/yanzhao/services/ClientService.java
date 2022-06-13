package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Client;
import com.gu.yanzhao.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // return list of clients
    public List<Client> getClient() {
        return clientRepository.findAll();
    }

    // save new client
    public void save(Client client) {
        clientRepository.save(client);
    }

    // get by id
    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }
}
