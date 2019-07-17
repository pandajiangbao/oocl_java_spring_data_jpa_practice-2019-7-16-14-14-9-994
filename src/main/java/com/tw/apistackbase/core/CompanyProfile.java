package com.tw.apistackbase.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompanyProfile {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer registeredCapital;
    private String certId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CompanyProfile(Long id, Integer registeredCapital, String certId) {
        this.id = id;
        this.registeredCapital = registeredCapital;
        this.certId = certId;
    }

    public CompanyProfile() {
    }

    public CompanyProfile(String certId, Integer registeredCapital) {
        this.certId = certId;
        this.registeredCapital = registeredCapital;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public Integer getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(Integer registeredCapital) {
        this.registeredCapital = registeredCapital;
    }
}
