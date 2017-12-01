package com.database.course.dao;

import com.database.course.model.JobPost;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
@Repository
public class JobPostDaoImpl implements JobpostDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<JobPost> findAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<JobPost> criteria = builder.createQuery(JobPost.class);
        criteria.from(JobPost.class);
        List<JobPost> posts = session.createQuery(criteria).getResultList();
        session.close();
        return posts;
    }

    @Override
    public List<JobPost> findByCity(String cityName) {
        Session session = sessionFactory.openSession();
        List<JobPost> posts = session.createQuery("SELECT jp FROM jobpost jp INNER JOIN location l ON jp.locationid = l.id WHERE l.name = :cityName").list();

//        for (Customer c : customersList) {
//            logger.info("Customer List::" + c);
//        }
//
//        return customersList;
//        CriteriaQuery<JobPost> criteria = builder.createQuery("FROM jobpost jp INNER JOIN location l ON jp.locationid = l.id");
//        criteria.from(JobPost.class);
//        List<JobPost> posts = session.createQuery(criteria).getResultList();
        return posts;
    }
}
