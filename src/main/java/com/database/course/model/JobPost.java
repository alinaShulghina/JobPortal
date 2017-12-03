package com.database.course.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by alin- on 01.12.2017.
 */
@Entity
@Table(name = "jobpost")
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "companyid")
    private Company company;


    @ManyToOne
    @JoinColumn(name = "jobtitleid")
    private JobTitle title;


    @ManyToOne
    @JoinColumn(name = "jobtypeid")
    private JobType type;


    @ManyToOne
    @JoinColumn(name = "locationid")
    private Location location;

    @ManyToMany
    @JoinTable(name = "jobskills", joinColumns = { @JoinColumn(name = "jobpostid")},
    inverseJoinColumns = {@JoinColumn(name = "skillid")})
    private List<Skill> skills = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public JobTitle getTitle() {
        return title;
    }

    public void setTitle(JobTitle title) {
        this.title = title;
    }

    public JobType getType() {
        return type;
    }

    public void setType(JobType type) {
        this.type = type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
