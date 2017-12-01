package com.database.course.dao;

import com.database.course.model.Location;

import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
public interface LocationDao {
    List<Location> findAll();
    Location findById(Long id);
    void save(Location location);
    void delete(Location location);
}
