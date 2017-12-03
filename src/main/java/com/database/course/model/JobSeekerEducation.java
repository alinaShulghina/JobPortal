package com.database.course.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by alin- on 03.12.2017.
 */
@Entity
@Table(name = "jobseekereducation")
public class JobSeekerEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "jobseekerid")
    private JobSeeker jobSeeker;

    @ManyToOne
    @JoinColumn(name = "universityid")
    private University university;

    @Column(name = "startingdate")
    private LocalDateTime startingDate;

    @Column(name = "endingdate")
    private LocalDateTime endingDate;

    private String specialization;

    public JobSeeker getJobSeeker() {
        return jobSeeker;
    }

    public void setJobSeeker(JobSeeker jobSeeker) {
        this.jobSeeker = jobSeeker;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public LocalDateTime getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDateTime startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDateTime getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDateTime endingDate) {
        this.endingDate = endingDate;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
