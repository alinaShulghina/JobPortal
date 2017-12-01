package com.database.course.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by alin- on 01.12.2017.
 */
@Entity
@Table(name = "jobpost")
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "companyid")
    private Company company;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jobtitleid")
    private JobTitle title;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "jobtypeid")
    private JobType type;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "locationid")
    private Location location;


    private Date postDate;

    private String salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
