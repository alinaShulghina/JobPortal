package com.database.course.dao;

import com.database.course.model.Skill;

import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
public interface SkillDao {
    List<Skill> findAll();
    Skill findById(int id);
    void save(Skill skill);
    void delete(Skill skill);
}
