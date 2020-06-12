package com.learning.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.location.model.Locations;
import com.learning.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepo;
	
	@Override
	public Locations saveLocation(Locations location) {
		
		return locationRepo.save(location);
	}

	@Override
	public Locations updateLocation(Locations location) {
			return locationRepo.save(location);
	}

	@Override
	public void deleteLocation(Locations location) {
		 locationRepo.delete(location);
	}

	@Override
	public Locations getLocationById(long id) {
		return locationRepo.findById(id).get();
	}

	@Override
	public List<Locations> getAllLocations() {
		return locationRepo.findAll();
	}

}
