package com.database.course.dao;

import com.database.course.model.Company;

import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
public interface CompanyDao {
    List<Company> findAll();
}
