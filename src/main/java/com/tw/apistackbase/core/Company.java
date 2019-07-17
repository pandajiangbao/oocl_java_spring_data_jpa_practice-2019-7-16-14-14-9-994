package com.tw.apistackbase.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;
//    @OneToOne(cascade=CascadeType.ALL)
//    @JoinColumn(name = "profile_id", referencedColumnName = "id")
//    private CompanyProfile profile;
//
//    public CompanyProfile getProfile() {
//        return profile;
//    }
//
//    public void setProfile(CompanyProfile profile) {
//        this.profile = profile;
//    }
    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
