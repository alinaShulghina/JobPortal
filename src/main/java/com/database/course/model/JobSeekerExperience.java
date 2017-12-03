package com.database.course.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by alin- on 03.12.2017.
 */
@Entity
@Table(name = "jobseekerexperience")
public class JobSeekerExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "jobseekerid")
    private JobSeeker jobSeeker;

    @ManyToOne
    @JoinColumn(name = "companyid")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "jobtitleid")
    private JobTitle jobTitle;

    private String description;

    @Column(name = "startingdate")
    private LocalDateTime startDate;

    @Column(name = "enddate")
    private LocalDateTime endDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JobSeeker getJobSeeker() {
        return jobSeeker;
    }

    public void setJobSeeker(JobSeeker jobSeeker) {
        this.jobSeeker = jobSeeker;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
