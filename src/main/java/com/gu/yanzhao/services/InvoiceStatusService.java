package com.gu.yanzhao.services;

import com.gu.yanzhao.models.InvoiceStatus;
import com.gu.yanzhao.repositories.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {

    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    // return list of invoiceStatuss
    public List<InvoiceStatus> getInvoiceStatus() {
        return invoiceStatusRepository.findAll();
    }

    // save new invoiceStatus
    public void save(InvoiceStatus invoiceStatus) {
        invoiceStatusRepository.save(invoiceStatus);
    }

    // get by id
    public Optional<InvoiceStatus> findById(Integer id) {
        return invoiceStatusRepository.findById(id);
    }

    public void delete(Integer id) {
        invoiceStatusRepository.deleteById(id);
    }
}
