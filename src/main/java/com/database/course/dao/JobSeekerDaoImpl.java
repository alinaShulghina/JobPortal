package com.database.course.dao;

import com.database.course.model.JobSeeker;
import jdk.nashorn.internal.scripts.JO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by alin- on 03.12.2017.
 */
@Repository
public class JobSeekerDaoImpl implements JobSeekerDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<JobSeeker> findAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<JobSeeker> criteria = builder.createQuery(JobSeeker.class);
        criteria.from(JobSeeker.class);
        List<JobSeeker> seekers = session.createQuery(criteria).getResultList();
        session.close();
        return seekers;
    }

    @Override
    public JobSeeker findById(int id) {
        Session session = sessionFactory.openSession();
        JobSeeker seeker = session.get(JobSeeker.class,id);
        session.close();
        return seeker;
    }

    @Override
    public void save(JobSeeker jobSeeker) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(jobSeeker);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(JobSeeker jobSeeker) {

    }
}
