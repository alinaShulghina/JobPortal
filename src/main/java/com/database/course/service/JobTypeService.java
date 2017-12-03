package com.database.course.service;


import com.database.course.model.JobType;

import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
public interface JobTypeService {
    List<JobType> findAll();
}
