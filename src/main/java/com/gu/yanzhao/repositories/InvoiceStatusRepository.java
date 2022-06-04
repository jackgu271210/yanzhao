package com.gu.yanzhao.repositories;

import com.gu.yanzhao.models.Contact;
import com.gu.yanzhao.models.InvoiceStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer> {
}
