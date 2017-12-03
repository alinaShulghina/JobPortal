package com.database.course.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alin- on 01.12.2017.
 */
@Entity
@Table(name = "Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String city;
    @NotNull
    private String region;

    @OneToMany(mappedBy = "location")
    private List<JobPost> jobPosts = new ArrayList<>();

    @OneToMany(mappedBy = "location")
    private List<University> universities = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String name) {
        this.city = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<JobPost> getJobPosts() {
        return jobPosts;
    }

    public void setJobPosts(List<JobPost> jobPosts) {
        this.jobPosts = jobPosts;
    }

    public List<University> getUniversities() {
        return universities;
    }

    public void setUniversities(List<University> universities) {
        this.universities = universities;
    }
}
