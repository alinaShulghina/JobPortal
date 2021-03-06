package com.database.course.dao;

import com.database.course.model.Company;
import com.database.course.model.Location;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
@Repository
public class CompanyDaoImpl implements CompanyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Company> findAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Company> criteria = builder.createQuery(Company.class);
        criteria.from(Company.class);
        List<Company> companies = session.createQuery(criteria).getResultList();
        session.close();
        return companies;
    }

    @Override
    public Company findById(int id) {
        Session session = sessionFactory.openSession();
        Company company = session.get(Company.class,id);
        session.close();
        return company;
    }

    @Override
    public void save(Company company) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(company);
        session.getTransaction().commit();
        session.close();
    }
}
