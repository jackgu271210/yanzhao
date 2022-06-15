package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Employee;
import com.gu.yanzhao.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // return list of employees
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    // save new employee
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    // get by id
    public Optional<Employee> findById(Integer id) {
        return employeeRepository.findById(id);
    }

    public void delete(Integer id) {
        employeeRepository.deleteById(id);
    }
}
