package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="patientsIf",schema = "patients")
public class PatientsInfo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first")
    private String first;

    @Column(name="lastname")
    private String lastname;

    @Column(name="dob")
    private String dob;
    
    @Column(name="gender")
    private String gender;
    
    @Column(name="phone")
    private String phone;
    
    @Column(name="memberid")
    private String memberid;

	public PatientsInfo(Long id, String first, String lastname, String dob, String gender, String phone,
			String memberid) {
		super();
		this.id = id;
		this.first = first;
		this.lastname = lastname;
		this.dob = dob;
		this.gender = gender;
		this.phone = phone;
		this.memberid = memberid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PatientsInfo [id=" + id + ", first=" + first + ", lastname=" + lastname + ", memberid=" + memberid
				+ ", phone=" + phone + ", gender=" + gender + ",[dob=" + dob + "]";
	}
    
   
    
    
    
    

}
