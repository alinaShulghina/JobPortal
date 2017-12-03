package com.database.course.service;

import com.database.course.model.JobPost;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
public interface JobpostService {
    List<JobPost> findAll();
    List<JobPost> findByCity(String cityName);
    List<JobPost> findByCompany(String companyName);
    List<JobPost> findByCompanyId(int id);
    JobPost findById(int id);
    void save(JobPost jobPost);
}
