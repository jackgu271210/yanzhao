package com.gu.yanzhao.services;

import com.gu.yanzhao.models.VehicleMake;
import com.gu.yanzhao.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {

    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    // return list of vehicleMakes
    public List<VehicleMake> getVehicleMake() {
        return vehicleMakeRepository.findAll();
    }

    // save new vehicleMake
    public void save(VehicleMake vehicleMake) {
        vehicleMakeRepository.save(vehicleMake);
    }

    // get by id
    public Optional<VehicleMake> findById(Integer id) {
        return vehicleMakeRepository.findById(id);
    }

    public void delete(Integer id) {
        vehicleMakeRepository.deleteById(id);
    }
}
