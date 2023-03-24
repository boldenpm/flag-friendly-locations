package com.nxtiteration.flagfriendly.location.service;

import org.springframework.stereotype.Service;

import com.nxtiteration.flagfriendly.location.data.LocationRepository;
import com.nxtiteration.flagfriendly.location.dto.LocationDTO;
import com.nxtiteration.flagfriendly.location.model.Location;

@Service
public class LocationService {

    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public LocationDTO getLocationById(final int id) {
        Location foundLocation = locationRepository.findLocationById(id);
        return new LocationDTO(foundLocation.getAddressLine1());
    }
}
