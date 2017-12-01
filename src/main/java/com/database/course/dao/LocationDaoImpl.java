package com.database.course.dao;

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
public class LocationDaoImpl implements LocationDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Location> findAll() {
        Session session = sessionFactory.openSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();


        CriteriaQuery<Location> criteria = builder.createQuery(Location.class);

        // Specify criteria root
        criteria.from(Location.class);

        // Execute query
        List<Location> cities = session.createQuery(criteria).getResultList();

        // Close session
        session.close();
        return cities;
    }

    @Override
    public Location findById(Long id) {
        return null;
    }

    @Override
    public void save(Location location) {

    }

    @Override
    public void delete(Location location) {

    }
}
