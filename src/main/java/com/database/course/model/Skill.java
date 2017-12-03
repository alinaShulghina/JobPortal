package com.database.course.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by alin- on 02.12.2017.
 */
@Entity
@Table(name="skill")
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "skills")
    private List<JobPost> posts = new ArrayList<>();

    @ManyToMany(mappedBy = "skills")
    private List<JobSeeker> jobSeekers = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<JobPost> getPosts() {
        return posts;
    }

    public void setPosts(List<JobPost> posts) {
        this.posts = posts;
    }

    public List<JobSeeker> getJobSeekers() {
        return jobSeekers;
    }

    public void setJobSeekers(List<JobSeeker> jobSeekers) {
        this.jobSeekers = jobSeekers;
    }
}
