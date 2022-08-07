package com.practice.oauth2openidproject.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "towns")
public class Town {
    @Id
    @GeneratedValue(strategy=    GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "dane_code")
    private int daneCode;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable=false)
    private Department department;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_Date")
    private Timestamp updatedDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaneCode() {
        return daneCode;
    }

    public void setDaneCode(int daneCode) {
        this.daneCode = daneCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }
}
