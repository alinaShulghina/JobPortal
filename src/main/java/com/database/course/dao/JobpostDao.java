package com.database.course.dao;

import com.database.course.model.JobPost;

import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
public interface JobpostDao {
    List<JobPost> findAll();
    List<JobPost> findByCity(String cityName);
}
