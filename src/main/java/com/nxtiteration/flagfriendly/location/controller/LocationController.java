package com.nxtiteration.flagfriendly.location.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxtiteration.flagfriendly.location.dto.LocationDTO;
import com.nxtiteration.flagfriendly.location.service.LocationService;

@RestController
public class LocationController {

    private LocationService locationService;
    
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/location/{id}")
    public LocationDTO getLocationById(int id) {
        return locationService.getLocationById(id);
    }
}
