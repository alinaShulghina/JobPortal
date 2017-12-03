package com.database.course.dao;

import com.database.course.model.Skill;
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
public class SkillDaoImpl implements SkillDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Skill> findAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Skill> criteria = builder.createQuery(Skill.class);
        criteria.from(Skill.class);
        List<Skill> skills = session.createQuery(criteria).getResultList();
        session.close();
        return skills;
    }

    @Override
    public Skill findById(int id) {
        Session session = sessionFactory.openSession();
        Skill skill = session.get(Skill.class,id);
        session.close();
        return skill;
    }

    @Override
    public void save(Skill skill) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(skill);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(Skill skill) {

    }
}
