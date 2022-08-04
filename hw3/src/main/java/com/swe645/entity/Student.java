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
    
    
//	public Student() {
//	}
//    
//	public Student(int id, String firstname, String lastname, String address, String city, String state, String zip,
//			String telephone, String email, String dos, String likedabtcampus, String intrestinuni, String recos) {
//		super();
//		this.id = id;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.address = address;
//		this.city = city;
//		this.state = state;
//		this.zip = zip;
//		this.telephone = telephone;
//		this.email = email;
//		this.dos = dos;
//		this.likedabtcampus = likedabtcampus;
//		this.intrestinuni = intrestinuni;
//		this.recos = recos;
//	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String getLikedabtcampus() {
		return likedabtcampus;
	}
	public void setLikedabtcampus(String likedabtcampus) {
		this.likedabtcampus = likedabtcampus;
	}
	public String getIntrestinuni() {
		return intrestinuni;
	}
	public void setIntrestinuni(String intrestinuni) {
		this.intrestinuni = intrestinuni;
	}
	public String getRecos() {
		return recos;
	}
	public void setRecos(String recos) {
		this.recos = recos;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + ", telephone=" + telephone + ", email="
				+ email + ", dos=" + dos + ", likedabtcampus=" + likedabtcampus + ", intrestinuni=" + intrestinuni
				+ ", recos=" + recos + "]";
	}
    
    
    
    
}
