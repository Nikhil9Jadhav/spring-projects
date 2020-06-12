package com.learning.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.location.model.Locations;

public interface LocationRepository extends JpaRepository<Locations, Long>{

}
