package com.learning.location.service;

import java.util.List;

import com.learning.location.model.Locations;

public interface LocationService {

	Locations saveLocation(Locations location);
	Locations updateLocation(Locations location);
	void deleteLocation(Locations location);
	Locations getLocationById(long id);
	List<Locations> getAllLocations();
	
}
