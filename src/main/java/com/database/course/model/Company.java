package com.database.course.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @Column(name = "siteurl")
    private String siteUrl;

    private byte[] image;

    @OneToMany(mappedBy = "company")
    List<JobPost> jobPosts = new ArrayList<>();

    @OneToMany(mappedBy = "company")
    List<HrManager> managers = new ArrayList<>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<JobPost> getJobPosts() {
        return jobPosts;
    }

    public void setJobPosts(List<JobPost> jobPosts) {
        this.jobPosts = jobPosts;
    }

    public List<HrManager> getManagers() {
        return managers;
    }

    public void setManagers(List<HrManager> managers) {
        this.managers = managers;
    }

}
