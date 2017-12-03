package com.database.course.dao;

import com.database.course.model.JobType;
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
public class JobTypeDaoImpl implements JobTypeDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<JobType> findAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<JobType> criteria = builder.createQuery(JobType.class);
        criteria.from(JobType.class);
        List<JobType> types = session.createQuery(criteria).getResultList();
        session.close();
        return types;
    }
}
