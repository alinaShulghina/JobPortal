package com.database.course.service;


import com.database.course.dao.JobpostDao;
import com.database.course.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
@Service
public class JobPostServiceImpl implements JobpostService{
    @Autowired
    private JobpostDao jobpostDao;

    @Override
    public List<JobPost> findAll() {
        return jobpostDao.findAll();
    }

    @Override
    public List<JobPost> findByCity(String cityName) {
        return jobpostDao.findByCity(cityName);
    }

    @Override
    public List<JobPost> findByCompany(String companyName) {
        return jobpostDao.findByCompany(companyName);
    }

    @Override
    public List<JobPost> findByCompanyId(int id) {
        return jobpostDao.findByCompanyId(id);
    }

    @Override
    public JobPost findById(int id) {
        return jobpostDao.findById(id);
    }

    @Override
    public void save(JobPost jobPost) {
        jobpostDao.save(jobPost);
    }
}
