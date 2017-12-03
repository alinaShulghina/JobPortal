package com.database.course.model;

import javax.persistence.*;

/**
 * Created by alin- on 03.12.2017.
 */
@Entity
@Table(name = "hrmanager")
public class HrManager {
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

    @ManyToOne
    @JoinColumn(name = "companyid")
    private Company company;

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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
