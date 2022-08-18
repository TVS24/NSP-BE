package com.wipro.velocity;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import com.wipro.velocity.model.StudentModel;

public class StudentModelTest {

	StudentModel stuMod=new StudentModel("380183206828","Hari","haribabutatikonda3@gmailcom", "Andra Pradesh", "prakasham", "2000-08-28", "male", "9032805118", "SBI", "12345678900","SBIN2006", "BC", "ANSN", "student", false);

	
	@Test
	  void testGetAadhar() {
	    String expected="380183206828";
	    String actual=stuMod.getAadhar();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetAadhar() {
	    String aadhar="380183206828";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setAadhar(aadhar);
	    assertEquals(feedBack.getAadhar(),aadhar );
	  }
	
	@Test
	  void testGetEmail() {
	    
	    String expected="haribabutatikonda3@gmailcom";
	    String actual=stuMod.getEmail();
	    assertEquals(expected, actual);
	  }
	
	@Test
	  void testSetEmail() {
	    String email="tvs@gmail.com";
	    StudentModel stu=new StudentModel();
	    stu.setEmail(email);
	    assertEquals(stu.getEmail(), email);
	  }
	
	
	@Test
	  void testGetName() {
	    String expected="Hari";
	    String actual=stuMod.getName();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetName() {
	    String name="uma";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setName(name);
	    assertEquals(feedBack.getName(),name );
	  }
	
	@Test
	  void testGetstateofDomicile() {
	    String expected="Andra Pradesh";
	    String actual=stuMod.getStateofDomicile();
	    assertEquals(expected, actual);
	  }
	
	@Test
	  void testSetstateofDomicile() {
		String stateofDomicile="Andhra Pradesh";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setStateofDomicile(stateofDomicile);
	    assertEquals(feedBack.getStateofDomicile(),stateofDomicile );
	  }
	
	
	@Test
	  void testGetDist() {
	    String expected="prakasham";
	    String actual=stuMod.getDist();
	    assertEquals(expected, actual);
	  }
	
	@Test
	  void testSetDist() {
	    String dist="prakasham";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setDist(dist);
	    assertEquals(feedBack.getDist(),dist);
	  }
	
	@Test
	  void testGetDob() {
	    String expected="2000-08-28";
	    String actual=stuMod.getDob();
	    assertEquals(expected, actual);
	  }
	
	@Test
	  void testSetDob() {
	    String dob="2000-08-28";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setDob(dob);
	    assertEquals(feedBack.getDob(),dob);
	  }
	
	@Test
	  void testGetGender() {
	    String expected="male";
	    String actual=stuMod.getGender();
	    assertEquals(expected, actual);
	  }
	
	@Test
	  void testSetGender() {
	    String gender="male";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setGender(gender);
	    assertEquals(feedBack.getGender(),gender);
	  }
	@Test
	  void testGetMobileNo() {
	    String expected="9032805118";
	    String actual=stuMod.getMobileNumber();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetMobileNo() {
	    String mobileNo="9032805118";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setMobileNumber(mobileNo);
	    assertEquals(feedBack.getMobileNumber(),mobileNo);
	  }
	
	@Test
	  void testGetBankName() {
	    String expected="SBI";
	    String actual=stuMod.getBankName();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetBankName() {
	    String bankName="SBI";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setBankName(bankName);
	    assertEquals(feedBack.getBankName(),bankName);
	  }
	
	@Test
	  void testGetAccountNo() {
	    String expected="12345678900";
	    String actual=stuMod.getAccountNo();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetAccountNo() {
	    String accountNo="12345678900";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setAccountNo(accountNo);
	    assertEquals(feedBack.getAccountNo(),accountNo);
	  }
	
	@Test
	  void testGetIfsc() {
	    String expected="SBIN2006";
	    String actual=stuMod.getIfsc();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetIfsc() {
	    String ifsc="SBIN2006";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setIfsc(ifsc);
	    assertEquals(feedBack.getIfsc(),ifsc);
	  }
	
	@Test
	  void testGetCommunity() {
	    String expected="BC";
	    String actual=stuMod.getCommunity();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetCommunity() {
	    String community="BC";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setCommunity(community);
	    assertEquals(feedBack.getCommunity(),community);
	  }
	
	@Test
	  void testGetInstitutionCode() {
	    String expected="ANSN";
	    String actual=stuMod.getInstitutionCode();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetInstitutionCode() {
	    String institutionCode="ANSN";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setInstitutionCode(institutionCode);
	    assertEquals(feedBack.getInstitutionCode(),institutionCode);
	  }
	
	@Test
	  void testGetPassword() {
	    String expected="student";
	    String actual=stuMod.getPassword();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetPassword() {
	    String password="student";
	    StudentModel feedBack=new StudentModel();
	    feedBack.setPassword(password);
	    assertEquals(feedBack.getPassword(),password);
	  }
	
	@Test
	  void testGetStatus() {
	    boolean expected=false;
	    boolean actual=stuMod.getStatus();
	    assertEquals(expected, actual);
	  }
	@Test
	  void testSetStatus() {
	    boolean status=false;
	    StudentModel feedBack=new StudentModel();
	    feedBack.setStatus(status);
	    assertEquals(feedBack.getStatus(),status);
	  }
	
	

}
