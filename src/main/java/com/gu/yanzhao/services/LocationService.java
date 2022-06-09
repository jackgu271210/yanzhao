package com.gu.yanzhao.services;

import com.gu.yanzhao.models.Location;
import com.gu.yanzhao.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    // return list of locations
    public List<Location> getLocation() {
        return locationRepository.findAll();
    }

    // save new location
    public void save(Location location) {
        locationRepository.save(location);
    }

    // get by id
    public Optional<Location> findById(Integer id) {
        return locationRepository.findById(id);
    }

    public void delete(Integer id) {
        locationRepository.deleteById(id);
    }
}
