package com.database.course.dao;

import com.database.course.model.JobTitle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
@Repository
public class JobTitleDaoImpl implements JobTitleDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<JobTitle> findAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<JobTitle> criteria = builder.createQuery(JobTitle.class);
        criteria.from(JobTitle.class);
        List<JobTitle> titles = session.createQuery(criteria).getResultList();
        session.close();
        return titles;
    }
}
