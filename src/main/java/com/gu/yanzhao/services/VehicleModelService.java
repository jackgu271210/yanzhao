package com.gu.yanzhao.services;

import com.gu.yanzhao.models.VehicleModel;
import com.gu.yanzhao.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    // return list of vehicleModels
    public List<VehicleModel> getVehicleModel() {
        return vehicleModelRepository.findAll();
    }

    // save new vehicleModel
    public void save(VehicleModel vehicleModel) {
        vehicleModelRepository.save(vehicleModel);
    }

    // get by id
    public Optional<VehicleModel> findById(Integer id) {
        return vehicleModelRepository.findById(id);
    }

    public void delete(Integer id) {
        vehicleModelRepository.deleteById(id);
    }
}
