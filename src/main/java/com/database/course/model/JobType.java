package com.database.course.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
@Entity
@Table(name = "jobtype")
public class JobType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String type;

    @OneToMany(mappedBy = "type")
    private List<JobPost> jobPosts = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<JobPost> getJobPosts() {
        return jobPosts;
    }

    public void setJobPosts(List<JobPost> jobPosts) {
        this.jobPosts = jobPosts;
    }
}
