package com.practice.oauth2openidproject.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "housing_projects")
public class HousingProject {
    @Id
    @GeneratedValue(strategy=    GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private long price;

    @ManyToOne
    @JoinColumn(name = "visibility_id", nullable=false)
    private Visibility visibility;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable=false)
    private Type type;

    @Column(name = "area")
    private int area;

    @Column(name = "in_condominium")
    private boolean inCondominium;

    @ManyToOne
    @JoinColumn(name = "town_id", nullable=false)
    private Town town;

    @Column(name = "sales_room_address")
    private String salesRoomAddress;

    @Column(name = "sales_room_phone")
    private String salesRoomPhone;

    @Column(name = "project_address")
    private String projectAddress;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean isInCondominium() {
        return inCondominium;
    }

    public void setInCondominium(boolean inCondominium) {
        this.inCondominium = inCondominium;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public String getSalesRoomAddress() {
        return salesRoomAddress;
    }

    public void setSalesRoomAddress(String salesRoomAddress) {
        this.salesRoomAddress = salesRoomAddress;
    }

    public String getSalesRoomPhone() {
        return salesRoomPhone;
    }

    public void setSalesRoomPhone(String salesRoomPhone) {
        this.salesRoomPhone = salesRoomPhone;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
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
