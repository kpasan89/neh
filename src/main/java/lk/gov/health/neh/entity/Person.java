/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.neh.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import lk.gov.health.neh.enums.Nationality;
import lk.gov.health.neh.enums.Religion;
import lk.gov.health.neh.enums.Sex;
import lk.gov.health.neh.enums.Title;

/**
 *
 * @author buddhika
 */
@Entity
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String name;
    String nic;
    @Enumerated(EnumType.STRING)
    Sex sex;
    @Enumerated(EnumType.STRING)
    Title title;
    @Enumerated(EnumType.STRING)
    Nationality nationality;
    @Enumerated(EnumType.STRING)
    Religion religion;
    
    
    
    boolean retired;
    @Temporal(javax.persistence.TemporalType.DATE)
    Date dob;
    @Transient
    String age;
    @Transient
    String nameWithTitle;
    @Lob
    String address;
    @ManyToOne
    Item occupation;
    @ManyToOne
    Item district;
    String telephoneNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNameWithTitle() {
        return nameWithTitle;
    }

    public void setNameWithTitle(String nameWithTitle) {
        this.nameWithTitle = nameWithTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Item getOccupation() {
        return occupation;
    }

    public void setOccupation(Item occupation) {
        this.occupation = occupation;
    }

    public Item getDistrict() {
        return district;
    }

    public void setDistrict(Item district) {
        this.district = district;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.gov.health.neh.Person[ id=" + id + " ]";
    }
    
}
