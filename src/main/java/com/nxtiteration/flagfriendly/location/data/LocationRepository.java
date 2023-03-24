package com.nxtiteration.flagfriendly.location.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nxtiteration.flagfriendly.location.model.Location;

@Repository
public interface LocationRepository extends PagingAndSortingRepository<Location, Long> {

    Location findLocationById(long id);
}
