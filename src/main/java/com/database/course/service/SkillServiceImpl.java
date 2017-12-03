package com.database.course.service;

import com.database.course.dao.SkillDao;
import com.database.course.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
@Service
public class SkillServiceImpl implements SkillService{

    @Autowired
    private SkillDao skillDao;

    @Override
    public List<Skill> findAll() {
        return skillDao.findAll();
    }

    @Override
    public Skill findById(int id) {
        return skillDao.findById(id);
    }

    @Override
    public void save(Skill skill) {
        skillDao.save(skill);
    }

    @Override
    public void delete(Skill skill) {
        skillDao.save(skill);
    }
}
