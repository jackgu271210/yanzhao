package com.gu.yanzhao.services;

import com.gu.yanzhao.models.VehicleMovement;
import com.gu.yanzhao.repositories.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMovementService {

    @Autowired
    private VehicleMovementRepository vehicleMovementRepository;

    // return list of vehicleMovements
    public List<VehicleMovement> getVehicleMovement() {
        return vehicleMovementRepository.findAll();
    }

    // save new vehicleMovement
    public void save(VehicleMovement vehicleMovement) {
        vehicleMovementRepository.save(vehicleMovement);
    }

    // get by id
    public Optional<VehicleMovement> findById(Integer id) {
        return vehicleMovementRepository.findById(id);
    }

    public void delete(Integer id) {
        vehicleMovementRepository.deleteById(id);
    }
}
