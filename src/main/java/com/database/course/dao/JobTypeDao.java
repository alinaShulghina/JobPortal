package com.database.course.dao;

import com.database.course.model.JobType;

import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
public interface JobTypeDao {
    List<JobType> findAll();
}
