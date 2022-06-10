package com.gu.yanzhao.services;

import com.gu.yanzhao.models.VehicleType;
import com.gu.yanzhao.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    // return list of vehicleTypes
    public List<VehicleType> getVehicleType() {
        return vehicleTypeRepository.findAll();
    }

    // save new vehicleType
    public void save(VehicleType vehicleType) {
        vehicleTypeRepository.save(vehicleType);
    }

    // get by id
    public Optional<VehicleType> findById(Integer id) {
        return vehicleTypeRepository.findById(id);
    }

    public void delete(Integer id) {
        vehicleTypeRepository.deleteById(id);
    }
}
