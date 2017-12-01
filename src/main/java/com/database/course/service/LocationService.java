package com.database.course.service;

import com.database.course.model.Location;

/**
 * Created by alin- on 01.12.2017.
 */
public interface LocationService {
    Iterable<Location> findAll();
    Location findById(int id);
}
