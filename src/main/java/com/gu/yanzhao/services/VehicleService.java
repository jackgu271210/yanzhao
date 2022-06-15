package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Vehicle;
import com.gu.yanzhao.models.Vehicle;
import com.gu.yanzhao.repositories.VehicleRepository;
import com.gu.yanzhao.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    // return list of vehicles
    public List<Vehicle> getVehicle() {
        return vehicleRepository.findAll();
    }

    // save new vehicle
    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    // get by id
    public Optional<Vehicle> findById(Integer id) {
        return vehicleRepository.findById(id);
    }

    public void delete(Integer id) {
        vehicleRepository.deleteById(id);
    }
}
