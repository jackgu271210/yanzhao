package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Invoice;
import com.gu.yanzhao.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    // return list of invoices
    public List<Invoice> getInvoice() {
        return invoiceRepository.findAll();
    }

    // save new invoice
    public void save(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    // get by id
    public Optional<Invoice> findById(Integer id) {
        return invoiceRepository.findById(id);
    }

    public void delete(Integer id) {
        invoiceRepository.deleteById(id);
    }
}
