package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Contact;
import com.gu.yanzhao.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // return list of contacts
    public List<Contact> getContact() {
        return contactRepository.findAll();
    }

    // save new contact
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    // get by id
    public Optional<Contact> findById(Integer id) {
        return contactRepository.findById(id);
    }

    public void delete(Integer id) {
        contactRepository.deleteById(id);
    }
}
