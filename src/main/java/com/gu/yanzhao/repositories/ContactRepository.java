package com.gu.yanzhao.repositories;

import com.gu.yanzhao.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
