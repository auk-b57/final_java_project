package edu.auk.java_proj.pojo;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Job implements Serializable{
// public class Job {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    public String title;
    public String company;
    public String location;
    public String type;
    public String level;
    public String yearsExp;
    public String country;
    public String skills;

    public Job(){};
    public Job(String title, String company, String location, String type, String level, String yearsExp,
            String country, String skills) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.type = type;
        this.level = level;
        this.yearsExp = yearsExp;
        this.country = country;
        this.skills = skills;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCompany() {
        return this.company;
    }

    public String getLocation() {
        return this.location;
    }

    public String getType() {
        return this.type;
    }

    public String getLevel() {
        return this.level;
    }

    public String getYearsExp() {
        return this.yearsExp;
    }

    public String getCountry() {
        return this.country;
    }

    public String getSkills() {
        return this.skills;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setYearsExp(String yearsExp) {
        this.yearsExp = yearsExp;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return title;
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return title == job.title &&
                Objects.equals(company, job.company);
    }
}