package com.gu.yanzhao.services;

import com.gu.yanzhao.models.VehicleStatus;
import com.gu.yanzhao.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {

    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;

    // return list of vehicleStatus
    public List<VehicleStatus> getVehicleStatus() {
        return vehicleStatusRepository.findAll();
    }

    // save new vehicleStatus
    public void save(VehicleStatus vehicleStatus) {
        vehicleStatusRepository.save(vehicleStatus);
    }

    // get by id
    public Optional<VehicleStatus> findById(Integer id) {
        return vehicleStatusRepository.findById(id);
    }

    public void delete(Integer id) {
        vehicleStatusRepository.deleteById(id);
    }
}
