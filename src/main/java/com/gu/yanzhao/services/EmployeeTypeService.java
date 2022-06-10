package com.gu.yanzhao.services;

import com.gu.yanzhao.models.EmployeeType;
import com.gu.yanzhao.repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    // return list of employeeTypes
    public List<EmployeeType> getEmployeeType() {
        return employeeTypeRepository.findAll();
    }

    // save new employeeType
    public void save(EmployeeType employeeType) {
        employeeTypeRepository.save(employeeType);
    }

    // get by id
    public Optional<EmployeeType> findById(Integer id) {
        return employeeTypeRepository.findById(id);
    }

    public void delete(Integer id) {
        employeeTypeRepository.deleteById(id);
    }
}
