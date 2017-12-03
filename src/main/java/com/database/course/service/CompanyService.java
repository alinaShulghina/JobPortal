package com.database.course.service;

import com.database.course.model.Company;


/**
 * Created by alin- on 01.12.2017.
 */

public interface CompanyService {
    Iterable<Company> findAll();
    Company findById(int id);
    void save(Company company);
}
