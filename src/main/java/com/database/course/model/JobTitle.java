package com.database.course.model;

import org.omg.CORBA.portable.IDLEntity;

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
    private int id;

    private String name;

    @OneToMany(mappedBy="title",cascade=CascadeType.ALL,fetch=FetchType.LAZY,
            orphanRemoval=true)
    private List<JobPost> jobPosts =new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
