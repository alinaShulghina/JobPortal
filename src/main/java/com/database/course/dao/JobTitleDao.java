package com.database.course.dao;

import com.database.course.model.JobTitle;

import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
public interface JobTitleDao {
    List<JobTitle> findAll();
}
