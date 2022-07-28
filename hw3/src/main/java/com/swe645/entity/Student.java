package com.swe645.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT_FORM")
public class Student {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zip")
    private String zip;
    @Column(name="telephone")
    private String telephone;
    @Column(name="email")
    private String email;
    @Column(name="dos")
    private String dos;
    @Column(name="likedabtcampus")
    private String likedabtcampus;
    @Column(name="intrestinuni")
    private String intrestinuni;
    @Column(name="recos")
    private String recos;
}
