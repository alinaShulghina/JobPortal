package com.database.course.dao;

import com.database.course.model.JobSeeker;

import java.util.List;

/**
 * Created by alin- on 03.12.2017.
 */
public interface JobSeekerDao {
    List<JobSeeker> findAll();
    JobSeeker findById(int id);
    void save(JobSeeker jobSeeker);
    void delete(JobSeeker jobSeeker);
}
