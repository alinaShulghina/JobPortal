package com.database.course.service;

import com.database.course.dao.JobSeekerDao;
import com.database.course.model.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alin- on 03.12.2017.
 */
@Service
public class JobSeekerServiceImpl implements JobSeekerService {

    @Autowired
    private JobSeekerDao jobSeekerDao;

    @Override
    public List<JobSeeker> findAll() {
        return jobSeekerDao.findAll();
    }

    @Override
    public JobSeeker findById(int id) {
        return jobSeekerDao.findById(id);
    }

    @Override
    public void save(JobSeeker jobSeeker) {
        jobSeekerDao.save(jobSeeker);
    }

    @Override
    public void delete(JobSeeker jobSeeker) {
        jobSeekerDao.delete(jobSeeker);
    }
}
