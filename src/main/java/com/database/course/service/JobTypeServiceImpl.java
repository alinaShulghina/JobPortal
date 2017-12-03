package com.database.course.service;

import com.database.course.dao.JobTypeDao;
import com.database.course.model.JobType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
@Service
public class JobTypeServiceImpl implements JobTypeService {

    @Autowired
    private JobTypeDao jobTypeDao;


    @Override
    public List<JobType> findAll() {
        return jobTypeDao.findAll();
    }
}
