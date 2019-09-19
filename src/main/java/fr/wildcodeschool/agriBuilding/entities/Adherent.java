package fr.wildcodeschool.agriBuilding.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adherent {
    @Id
    private Long id;

    private String company;

    private String typo;

    private String mission;

    private String sector;

    private String website;

    private String fullname;

    private String role;

    private String firstExpertise;

    private String secondExpertise;

    public Adherent() {
    }

    public Adherent(Long id, String company, String typo, String mission, String sector, String website,
            String fullname, String role, String firstExpertise, String secondExpertise) {
        this.id = id;
        this.company = company;
        this.typo = typo;
        this.mission = mission;
        this.sector = sector;
        this.website = website;
        this.fullname = fullname;
        this.role = role;
        this.firstExpertise = firstExpertise;
        this.secondExpertise = secondExpertise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTypo() {
        return typo;
    }

    public void setTypo(String typo) {
        this.typo = typo;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstExpertise() {
        return firstExpertise;
    }

    public void setFirstExpertise(String firstExpertise) {
        this.firstExpertise = firstExpertise;
    }

    public String getSecondExpertise() {
        return secondExpertise;
    }

    public void setSecondExpertise(String secondExpertise) {
        this.secondExpertise = secondExpertise;
    }
}