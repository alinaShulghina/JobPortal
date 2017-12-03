package com.database.course.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
@Entity
@Table(name = "jobtitle")
public class JobTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy="title")
    private List<JobPost> jobPosts =new ArrayList<>();

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

    public List<JobPost> getJobPosts() {
        return jobPosts;
    }

    public void setJobPosts(List<JobPost> jobPosts) {
        this.jobPosts = jobPosts;
    }
}
