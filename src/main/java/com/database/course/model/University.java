package com.database.course.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alin- on 03.12.2017.
 */
@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "locationid")
    private Location location;

    @OneToMany(mappedBy = "university")
    private List<JobSeekerEducation> jobSeekerEducations = new ArrayList<>();

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<JobSeekerEducation> getJobSeekerEducations() {
        return jobSeekerEducations;
    }

    public void setJobSeekerEducations(List<JobSeekerEducation> jobSeekerEducations) {
        this.jobSeekerEducations = jobSeekerEducations;
    }
}
