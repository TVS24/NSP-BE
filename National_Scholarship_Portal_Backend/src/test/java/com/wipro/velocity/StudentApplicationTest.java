package com.wipro.velocity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wipro.velocity.model.StudentApplication;

import org.junit.jupiter.api.Test;

public class StudentApplicationTest {
	
 StudentApplication stuApp=new StudentApplication("250108065353", "9985604842", "Vikram", "24-08-2000", "vikram@gmail.com", "Hindu", "BC", "Srinivas", "Lakshmi", "200000", "SACET", "Btech", "4", "regular", "12-06-2021", "JNTUK", "Intermediate", "2018", "92.4", "1616116614", "SSC", "2016","92", "1807216324", "HSC", "2018", "92.4", "1500", "60000", "5000", "No", "NA", "0", "single", "Weaver", "Andhra Pradesh", "Amaravati", "Chirala", "8-87", "Street-5", "523157", "Male", "Merit", false, false);
 
 @Test
 void testGetAadhar() {
	 String expected="250108065353";
	 String actual=stuApp.getAadhar();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetAadhar() {
	 String aadhar="250108065353";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setAadhar(aadhar);
	 assertEquals(feedback.getAadhar(),aadhar);
	
}
 
 @Test
 void testGetPhoneNumber() {
	 String expected="9985604842";
	 String actual=stuApp.getPhoneNumber();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetPhoneNumber() {
	 String phoneNumber="9985604842";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setPhoneNumber(phoneNumber);
	 assertEquals(feedback.getPhoneNumber(),phoneNumber);
 	}
 
 @Test
 void testGetName() {
	 String expected="Vikram";
	 String actual=stuApp.getName();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetName() {
	 String name="Vikram";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setName(name);
	 assertEquals(feedback.getName(),name);
	}
 
 @Test
 void testGetDob() {
	 String expected="24-08-2000";
	 String actual=stuApp.getDob();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetDob() {
	 String dob="24-08-2000";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setDob(dob);
	 assertEquals(feedback.getDob(),dob);
	}
 
 @Test
 void testGetEmail() {
	 String expected="vikram@gmail.com";
	 String actual=stuApp.getEmail();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetEmail() {
	 String email="vikram@gmail.com";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setEmail(email);
	 assertEquals(feedback.getEmail(),email);
	}
 
 @Test
 void testGetReligion() {
	 String expected="Hindu";
	 String actual=stuApp.getReligion();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetReligion() {
	 String religion="Hindu";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setReligion(religion);
	 assertEquals(feedback.getReligion(),religion);
	}
 
 @Test
 void testGetCommunity() {
	 String expected="BC";
	 String actual=stuApp.getCommunity();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetCommunity() {
	 String community="BC";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setCommunity(community);
	 assertEquals(feedback.getCommunity(),community);
	}
 
 @Test
 void testGetFatherName() {
	 String expected="Srinivas";
	 String actual=stuApp.getFatherName();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetFatherName() {
	 String fatherName="Srinivas";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setFatherName(fatherName);
	 assertEquals(feedback.getFatherName(),fatherName);
	}
 
 @Test
 void testGetMotherName() {
	 String expected="Lakshmi";
	 String actual=stuApp.getMotherName();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetMotherName() {
	 String motherName="Lakshmi";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setMotherName(motherName);
	 assertEquals(feedback.getMotherName(),motherName);
	}
 
 @Test
 void testGetAnnualIncome() {
	 String expected="200000";
	 String actual=stuApp.getAnnualIncome();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetAnnualIncome() {
	 String annualIncome="200000";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setAnnualIncome(annualIncome);
	 assertEquals(feedback.getAnnualIncome(),annualIncome);
	}
 
 @Test
 void testGetInstitution() {
	 String expected="SACET";
	 String actual=stuApp.getInstitution();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetInstitution() {
	 String institution="SACET";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setInstitution(institution);
	 assertEquals(feedback.getInstitution(),institution);
	}
 
 @Test
 void testGetPresentClass() {
	 String expected="Btech";
	 String actual=stuApp.getPresentClass();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetPresentClass() {
	 String presentClass="Btech";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setPresentClass(presentClass);
	 assertEquals(feedback.getPresentClass(),presentClass);
	}
 
 @Test
 void testGetPresentClassYear() {
	 String expected="4";
	 String actual=stuApp.getPresentClassYear();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetPresentClassYear() {
	 String presentClassYear="4";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setPresentClassYear(presentClassYear);
	 assertEquals(feedback.getPresentClassYear(),presentClassYear);
	}
 
 @Test
 void testGetModeOfStudy() {
	 String expected="regular";
	 String actual=stuApp.getModeOfStudy();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetModeOfStudy() {
	 String modeOfStudy="regular";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setModeOfStudy(modeOfStudy);
	 assertEquals(feedback.getModeOfStudy(),modeOfStudy);
	}
 
 @Test
 void testGetClassStartDate() {
	 String expected="12-06-2021";
	 String actual=stuApp.getClassStartDate();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetClassStartDate() {
	 String classStartDate="12-06-2021";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setClassStartDate(classStartDate);
	 assertEquals(feedback.getClassStartDate(),classStartDate);
	}
 
 @Test
 void testGetUniversity() {
	 String expected="JNTUK";
	 String actual=stuApp.getUniversity();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetUniversity() {
	 String university="JNTUK";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setUniversity(university);
	 assertEquals(feedback.getUniversity(),university);
	}
 
 @Test
 void testGetPriviousClass() {
	 String expected="Intermediate";
	 String actual=stuApp.getPreviousClass();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetPreviousClass() {
	 String previousClass="Intermediate";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setPreviousClass(previousClass);
	 assertEquals(feedback.getPreviousClass(),previousClass);
	}
 
 @Test
 void testGetPriviousClassYear() {
	 String expected="2018";
	 String actual=stuApp.getPreviousClassYear();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetPreviousClassYear() {
	 String previousClassYear="2018";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setPreviousClassYear(previousClassYear);
	 assertEquals(feedback.getPreviousClassYear(),previousClassYear);
	}
 
 @Test
 void testGetPriviousPercentage() {
	 String expected="92.4";
	 String actual=stuApp.getPreviousPercentage();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetPreviousPercentage() {
	 String previousPercentage="92.4";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setPreviousPercentage(previousPercentage);
	 assertEquals(feedback.getPreviousPercentage(),previousPercentage);
	}
 

 @Test
 void testGetTenthRollNo() {
	 String expected="1616116614";
	 String actual=stuApp.getTenthRollNo();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTenthRollNo() {
	 String tenthRollNo="1616116614";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTenthRollNo(tenthRollNo);
	 assertEquals(feedback.getTenthRollNo(),tenthRollNo);
	}
 
 @Test
 void testGetTenthBoard() {
	 String expected="SSC";
	 String actual=stuApp.getTenthBoard();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTenthBoard() {
	 String tenthBoard="SSC";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTenthBoard(tenthBoard);
	 assertEquals(feedback.getTenthBoard(),tenthBoard);
	}
 
 @Test
 void testGetTenthYear() {
	 String expected="2016";
	 String actual=stuApp.getTenthYear();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTenthYear() {
	 String tenthYear="2016";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTenthYear(tenthYear);
	 assertEquals(feedback.getTenthYear(),tenthYear);
	}
 
 @Test
 void testGetTenthPercentage() {
	 String expected="92";
	 String actual=stuApp.getTenthPercentage();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTenthPercentage() {
	 String tenthPercentage="92";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTenthPercentage(tenthPercentage);
	 assertEquals(feedback.getTenthPercentage(),tenthPercentage);
	}
 
 
 @Test
 void testGetTwelthRollNo() {
	 String expected="1807216324";
	 String actual=stuApp.getTwelthRollNo();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTwelthRollNo() {
	 String twelthRollNo="1807216324";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTwelthRollNo(twelthRollNo);
	 assertEquals(feedback.getTwelthRollNo(),twelthRollNo);
	}
 
 @Test
 void testGetTwelthBoard() {
	 String expected="HSC";
	 String actual=stuApp.getTwelthBoard();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTwelthBoard() {
	 String twelthBoard="HSC";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTwelthBoard(twelthBoard);
	 assertEquals(feedback.getTwelthBoard(),twelthBoard);
	}
 @Test
 void testGetTwelthYear() {
	 String expected="2018";
	 String actual=stuApp.getTwelthYear();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTwelthYear() {
	 String twelthYear="2018";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTwelthYear(twelthYear);
	 assertEquals(feedback.getTwelthYear(),twelthYear);
	}
 @Test
 void testGetTwelthPercentage() {
	 String expected="92.4";
	 String actual=stuApp.getTwelthPercentage();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTwelthPercentage() {
	 String twelthPercentage="92.4";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTwelthPercentage(twelthPercentage);
	 assertEquals(feedback.getTwelthPercentage(),twelthPercentage);
	}
 
 @Test
 void testGetAdmissionFee() {
	 String expected="1500";
	 String actual=stuApp.getAdmissionFee();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetAdmissionFee() {
	 String admissionFee="1500";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setAdmissionFee(admissionFee);
	 assertEquals(feedback.getAdmissionFee(),admissionFee);
	}
 
 @Test
 void testGetTuitionFee() {
	 String expected="60000";
	 String actual=stuApp.getTuitionFee();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTuitionFee() {
	 String tuitionFee="60000";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTuitionFee(tuitionFee);
	 assertEquals(feedback.getTuitionFee(),tuitionFee);
	}
 
 @Test
 void testGetOtherFee() {
	 String expected="5000";
	 String actual=stuApp.getOtherFee();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetOtherFee() {
	 String otherFee="5000";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setOtherFee(otherFee);
	 assertEquals(feedback.getOtherFee(),otherFee);
	}
 
 @Test
 void testGetIsDisabled() {
	 String expected="No";
	 String actual=stuApp.getIsDisabled();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetIsdisabled() {
	 String isDisabled="No";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setIsDisabled(isDisabled);
	 assertEquals(feedback.getIsDisabled(),isDisabled);
	}
 
 @Test
 void testGetTypeOfDisability() {
	 String expected="NA";
	 String actual=stuApp.getTypeOfDisability();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTypeOfDisability() {
	 String typeOfDisabled="NA";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTypeOfDisability(typeOfDisabled);
	 assertEquals(feedback.getTypeOfDisability(),typeOfDisabled);
	}
 
 @Test
 void testGetDisabilityPercentage() {
	 String expected="0";
	 String actual=stuApp.getDisabilityPercenage();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetDisabilityPercentage() {
	 String disabilityPercentage="0";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setDisabilityPercenage(disabilityPercentage);
	 assertEquals(feedback.getDisabilityPercenage(),disabilityPercentage);
	}
 
 @Test
 void testGetMaritalStatus() {
	 String expected="single";
	 String actual=stuApp.getMaritalStatus();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetMaritalStatus() {
	 String maritalStatus="single";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setMaritalStatus(maritalStatus);
	 assertEquals(feedback.getMaritalStatus(),maritalStatus);
	}
 
 @Test
 void testGetParentsProfession() {
	 String expected="Weaver";
	 String actual=stuApp.getParentsProfession();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetParentsProfession() {
	 String parentsProfession="Weaver";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setParentsProfession(parentsProfession);
	 assertEquals(feedback.getParentsProfession(),parentsProfession);
	}
 
 @Test
 void testGetState() {
	 String expected="Andhra Pradesh";
	 String actual=stuApp.getState();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetState() {
	 String state="Andhra Pradesh";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setState(state);
	 assertEquals(feedback.getState(),state);
	}
 
 @Test
 void testGetDistrict() {
	 String expected="Amaravati";
	 String actual=stuApp.getDistrict();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetDistrict() {
	 String district="Amaravati";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setDistrict(district);
	 assertEquals(feedback.getDistrict(),district);
	}
 
 @Test
 void testGetTaluk() {
	 String expected="Chirala";
	 String actual=stuApp.getTaluk();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetTaluk() {
	 String taluk="Chirala";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setTaluk(taluk);
	 assertEquals(feedback.getTaluk(),taluk);
	}
 
 @Test
 void testGetHouseNo() {
	 String expected="8-87";
	 String actual=stuApp.getHouseNo();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetHouseNo() {
	 String houseNo="8-87";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setHouseNo(houseNo);
	 assertEquals(feedback.getHouseNo(),houseNo);
	}
 
 @Test
 void testGetStreetNo() {
	 String expected="Street-5";
	 String actual=stuApp.getStreerNo();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetStreetNo() {
	 String streetNo="Street-5";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setStreerNo(streetNo);
	 assertEquals(feedback.getStreerNo(),streetNo);
	}
 
 @Test
 void testGetPinCode() {
	 String expected="523157";
	 String actual=stuApp.getPincode();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetPinCode() {
	 String pinCode="523157";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setPincode(pinCode);
	 assertEquals(feedback.getPincode(),pinCode);
	}
 
 @Test
 void testGetGender() {
	 String expected="Male";
	 String actual=stuApp.getGender();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetGender() {
	 String gender="Male";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setGender(gender);
	 assertEquals(feedback.getGender(),gender);
	}
 
 @Test
 void testGetScheme() {
	 String expected="Merit";
	 String actual=stuApp.getScheme();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetScheme() {
	 String scheme="Merit";
	 StudentApplication feedback=new StudentApplication();
	 feedback.setScheme(scheme);
	 assertEquals(feedback.getScheme(),scheme);
	}
 
 @Test
 void testGetStatus() {
	 boolean expected=false;
	 boolean actual=stuApp.getStatus();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetStatus() {
	 boolean status=false;
	 StudentApplication feedback=new StudentApplication();
	 feedback.setStatus(status);
	 assertEquals(feedback.getStatus(),status);
	}
 
 @Test
 void testGetFinalStatus() {
	 boolean expected=false;
	 boolean actual=stuApp.getFinalStatus();
	 assertEquals(expected,actual);
	}
 
 @Test
 void testSetFinalStatus() {
	 boolean finalStatus=false;
	 StudentApplication feedback=new StudentApplication();
	 feedback.setFinalStatus(finalStatus);
	 assertEquals(feedback.getFinalStatus(),finalStatus);
	}
}
