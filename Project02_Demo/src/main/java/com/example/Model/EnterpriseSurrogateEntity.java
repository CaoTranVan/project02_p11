package com.example.Model;

import javax.persistence.*;

/**
 * Created by Tran_Cao on 3/5/2017.
 */
@Entity
@Table(name = "enterprise_surrogate", schema = "project02_p11", catalog = "")
public class EnterpriseSurrogateEntity {
    private int enterpriseSurragateId;
    private String name;
    private String userName;
    private String email;
    private String password;
    private Integer phoneNumber;
    private String location;
    private Integer quantity;

    @Id
    @Column(name = "enterprise_surragate_id")
    public int getEnterpriseSurragateId() {
        return enterpriseSurragateId;
    }

    public void setEnterpriseSurragateId(int enterpriseSurragateId) {
        this.enterpriseSurragateId = enterpriseSurragateId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "phone_number")
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnterpriseSurrogateEntity that = (EnterpriseSurrogateEntity) o;

        if (enterpriseSurragateId != that.enterpriseSurragateId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = enterpriseSurragateId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }
}
