package com.database.course.service;

import com.database.course.dao.LocationDao;
import com.database.course.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by alin- on 01.12.2017.
 */
@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationDao locationService;

    @Override
    public Iterable<Location> findAll() {
        return locationService.findAll();
    }

    @Override
    public Location findById(int id) {
        return null;
    }
}
