package com.api.parkingcontrol.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.services.ParkingSpotService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-Spot")
public class ParkingSpotController {
	
	ParkingSpotService parkingSpotService = null;
	
	public ParkingSpotController(ParkingSpotService parkingSpotService) {
		this.parkingSpotService = this.parkingSpotService;
	}
	
	
}
