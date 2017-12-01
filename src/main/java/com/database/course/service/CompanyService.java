package com.database.course.service;

import com.database.course.model.Company;
import org.springframework.stereotype.Service;

/**
 * Created by alin- on 01.12.2017.
 */

public interface CompanyService {
    Iterable<Company> findAll();
}
