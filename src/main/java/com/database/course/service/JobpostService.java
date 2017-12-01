package com.database.course.service;

import com.database.course.model.JobPost;

import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
public interface JobpostService {
    List<JobPost> findAll();
    List<JobPost> findByCity(String cityName);
}
