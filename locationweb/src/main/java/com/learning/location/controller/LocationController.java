package com.learning.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.location.model.Locations;
import com.learning.location.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	LocationService locationService;

	@GetMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	
	@PostMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("locations") Locations location , ModelMap model) {
		
		Locations locationSaved = locationService.saveLocation(location);
		String msg = "Location saved with id: " + locationSaved.getId();
		model.addAttribute("msg",msg);
		return "createLocation";
	}
	
	@GetMapping("/displayLoc")
	public String displayLocations(ModelMap model) {
		List<Locations> locations = locationService.getAllLocations();
		model.addAttribute("locationsList" , locations);
		return "showLocations";
	}
	
	@GetMapping("/deleteLoc")
	public String deleteLocation(@RequestParam("id") String id,ModelMap model) {
		Locations location = locationService.getLocationById(Integer.parseInt(id));
		locationService.deleteLocation(location);
		return "redirect:displayLoc";
	}
	
	@GetMapping("/showUpdate")
	public String showUpdate(ModelMap model ,@RequestParam("id") String id) {
		Locations locations = locationService.getLocationById(Integer.parseInt(id));
		model.addAttribute("locations", locations);
		return "editLocation";
	}
	
	@PostMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("locations") Locations location , ModelMap model) {
		locationService.saveLocation(location);
		return "redirect:displayLoc";
	}
}
