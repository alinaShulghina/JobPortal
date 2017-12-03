package com.database.course.dao;

import com.database.course.model.JobPost;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.stream.Collectors;

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
        return findAll().stream().filter(jobPost -> jobPost.getLocation().getCity().trim().equals(cityName)).collect(Collectors.toList());
    }

    @Override
    public List<JobPost> findByCompany(String companyName) {
        return findAll().stream().filter(jobPost -> jobPost.getCompany().getName().trim().equals(companyName)).collect(Collectors.toList());
    }

    @Override
    public List<JobPost> findByCompanyId(int id) {
        return findAll().stream().filter(jobPost -> jobPost.getCompany().getId() == id).collect(Collectors.toList());
    }

    @Override
    public JobPost findById(int id) {
        Session session = sessionFactory.openSession();
        JobPost jobPost = session.get(JobPost.class,id);
        session.close();
        return jobPost;
    }

    @Override
    public void save(JobPost jobPost) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(jobPost);
        session.getTransaction().commit();
        session.close();
    }
}
