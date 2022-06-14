package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Vehicle;
import com.gu.yanzhao.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    // return list of vehicles
    public List<Vehicle> getVehicle() {
        return vehicleRepository.findAll();
    }
}
