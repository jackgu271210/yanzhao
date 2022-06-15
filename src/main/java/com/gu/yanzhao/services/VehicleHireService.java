package com.gu.yanzhao.services;

import com.gu.yanzhao.models.VehicleHire;
import com.gu.yanzhao.repositories.VehicleHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleHireService {

    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    // return list of vehicleHires
    public List<VehicleHire> getVehicleHire() {
        return vehicleHireRepository.findAll();
    }

    // save new vehicleHire
    public void save(VehicleHire vehicleHire) {
        vehicleHireRepository.save(vehicleHire);
    }

    // get by id
    public Optional<VehicleHire> findById(Integer id) {
        return vehicleHireRepository.findById(id);
    }

    public void delete(Integer id) {
        vehicleHireRepository.deleteById(id);
    }
}
