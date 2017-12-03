package com.database.course.service;

import com.database.course.model.Skill;

import java.util.List;

/**
 * Created by alin- on 02.12.2017.
 */
public interface SkillService {
    List<Skill> findAll();
    Skill findById(int id);
    void save(Skill skill);
    void delete(Skill skill);
}
