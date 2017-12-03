package com.database.course.service;

import com.database.course.dao.JobTitleDao;
import com.database.course.model.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
@Service
public class JobTitleServiceImpl implements JobTitleService {

    @Autowired
    private JobTitleDao jobTitleDao;

    @Override
    public List<JobTitle> findAll() {
        return jobTitleDao.findAll();
    }
}
