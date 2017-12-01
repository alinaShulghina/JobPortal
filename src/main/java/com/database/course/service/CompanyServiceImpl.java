package com.database.course.service;

import com.database.course.dao.CompanyDao;
import com.database.course.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by alin- on 01.12.2017.
 */
@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDao companyDao;

    @Override
    public Iterable<Company> findAll() {
        return companyDao.findAll();
    }
}
