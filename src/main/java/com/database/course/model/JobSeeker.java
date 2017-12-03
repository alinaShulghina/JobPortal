package com.database.course.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alin- on 03.12.2017.
 */
@Entity
@Table(name = "jobseeker")
public class JobSeeker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name="middlename")
    private String middleName;

    @Column(name = "lastname")
    private String lastName;

    private String email;

    private String password;

    private byte[] image;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "jobseekerskills", joinColumns = { @JoinColumn(name = "jobseekerid")},
            inverseJoinColumns = {@JoinColumn(name = "skillid")})
    private List<Skill> skills = new ArrayList<>();

    @OneToMany(mappedBy = "jobSeeker")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<JobSeekerEducation> educations = new ArrayList<>();

    @OneToMany(mappedBy = "jobSeeker")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<JobSeekerExperience> experiences = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<JobSeekerEducation> getEducations() {
        return educations;
    }

    public void setEducations(List<JobSeekerEducation> educations) {
        this.educations = educations;
    }

    public List<JobSeekerExperience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<JobSeekerExperience> experiences) {
        this.experiences = experiences;
    }
}
