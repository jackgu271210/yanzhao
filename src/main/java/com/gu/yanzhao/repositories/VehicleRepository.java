package com.gu.yanzhao.repositories;

import com.gu.yanzhao.models.Contact;
import com.gu.yanzhao.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
