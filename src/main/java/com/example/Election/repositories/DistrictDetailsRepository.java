package com.example.Election.repositories;

import com.example.Election.entities.District;
import com.example.Election.entities.DistrictDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DistrictDetailsRepository extends JpaRepository<DistrictDetails, Integer> {
    Optional<DistrictDetails> findByDistrict(District district);

}
