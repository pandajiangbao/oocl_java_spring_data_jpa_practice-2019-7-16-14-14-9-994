package com.tw.apistackbase.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Company {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    private CompanyProfile profile;

    public CompanyProfile getProfile() {
        return profile;
    }

    public void setProfile(CompanyProfile profile) {
        this.profile = profile;
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

    public Company() {
    }

    public Company(CompanyProfile profile) {
        this.profile = profile;
    }

    public Company(String name, CompanyProfile profile) {
        this.name = name;
        this.profile = profile;
    }
}
