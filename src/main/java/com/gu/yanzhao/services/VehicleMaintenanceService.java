package com.gu.yanzhao.services;

import com.gu.yanzhao.models.VehicleMaintenance;
import com.gu.yanzhao.repositories.VehicleMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenanceService {

    @Autowired
    private VehicleMaintenanceRepository vehicleMaintenanceRepository;

    // return list of vehicleMaintenances
    public List<VehicleMaintenance> getVehicleMaintenance() {
        return vehicleMaintenanceRepository.findAll();
    }

    // save new vehicleMaintenance
    public void save(VehicleMaintenance vehicleMaintenance) {
        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }

    // get by id
    public Optional<VehicleMaintenance> findById(Integer id) {
        return vehicleMaintenanceRepository.findById(id);
    }

    public void delete(Integer id) {
        vehicleMaintenanceRepository.deleteById(id);
    }
}
