package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Supplier;
import com.gu.yanzhao.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    // return list of suppliers
    public List<Supplier> getSupplier() {
        return supplierRepository.findAll();
    }

    // save new supplier
    public void save(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    // get by id
    public Optional<Supplier> findById(Integer id) {
        return supplierRepository.findById(id);
    }

    public void delete(Integer id) {
        supplierRepository.deleteById(id);
    }
}
