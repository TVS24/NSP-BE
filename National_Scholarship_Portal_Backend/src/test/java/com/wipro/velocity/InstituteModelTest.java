package com.wipro.velocity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wipro.velocity.model.InstituteModel;
import com.wipro.velocity.model.StudentModel;

import org.junit.jupiter.api.Test;

public class InstituteModelTest {
	
	InstituteModel instMod=new InstituteModel("Govt aided","SACET","Andhra Pradesh","Amaravati","ANSN","sacetedu@gmail.com","ANSN","Amaravati","Private","Andhra Pradesh","JNTUK","2001","sacet","Nayunipalli","Vetapalem","Amaravati","Andhra Pradesh","Amaravati","523146","Gopala Rao","564123",false,false);
	
	@Test
	void testGetInstitutionCategory() {
		String expected="Govt aided";
		String actual=instMod.getInstitutionCategory();
		assertEquals(expected,actual);
	}
	
	@Test
	  void testSetInstitutionCategory() {
	    String institutionCategory="Govt aided";
	    InstituteModel feedback=new InstituteModel();
	    feedback.setInstitutionCategory(institutionCategory);
	    assertEquals(feedback.getInstitutionCategory(), institutionCategory);
	  }
	
	@Test
	void testGetName() {
		String expected="SACET";
		String actual=instMod.getName();
		assertEquals(expected,actual);
	}
	
	@Test
	  void testSetName() {
	    String name="SACET";
	    InstituteModel feedback=new InstituteModel();
	    feedback.setName(name);
	    assertEquals(feedback.getName(), name);
	  }
	
	@Test
	void testGetInstState() {
		String expected="Andhra Pradesh";
		String actual=instMod.getInstState();
		assertEquals(expected,actual);
	}
	@Test
	  void testSetInstState() {
	    String instState="Andhra Pradesh";
	    InstituteModel feedback=new InstituteModel();
	    feedback.setInstState(instState);
	    assertEquals(feedback.getInstState(), instState);
	  }
		
		@Test
		void testGetInstitutionCode() {
			String expected="ANSN";
			String actual=instMod.getInstitutionCode();
			assertEquals(expected,actual);
		}
		@Test
		  void testSetInstitutionCode() {
		    String institutionCode="ANSN";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setInstitutionCode(institutionCode);
		    assertEquals(feedback.getInstitutionCode(), institutionCode);
		  }
		
		
		@Test
		void testGetEmail() {
			String expected="sacetedu@gmail.com";
			String actual=instMod.getEmail();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetEmail() {
		    String email="sacetedu@gmail.com";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setEmail(email);
		    assertEquals(feedback.getEmail(), email);
		  }
		
		
		@Test
		void testGetDiseCode() {
			String expected="ANSN";
			String actual=instMod.getDiseCode();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetDiseCode() {
		    String diseCode="ANSN";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setDiseCode(diseCode);
		    assertEquals(feedback.getDiseCode(), diseCode);
		  }
		
		@Test
		void testGetLocation() {
			String expected="Amaravati";
			String actual=instMod.getLocation();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetLocation() {
		    String location="Amaravati";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setLocation(location);
		    assertEquals(feedback.getLocation(), location);
		  }
		
		@Test
		void testGetAffilatedUniversityState() {
			String expected="Andhra Pradesh";
			String actual=instMod.getAffilatedUniversityState();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetAffilatedUniversityState() {
		    String affilatedUniversityState="Andhra Pradesh";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setAffilatedUniversityState(affilatedUniversityState);
		    assertEquals(feedback.getAffilatedUniversityState(), affilatedUniversityState);
		  }
		
		@Test
		void testGetAffilatedUniversityBoardName() {
			String expected="JNTUK";
			String actual=instMod.getAffilatedUniversityBoardName();
			assertEquals(expected,actual);
          }
		
		@Test
		  void testSetAffilatedUniversityBoardName() {
		    String affilatedUniversityBoardName="Andhra Pradesh";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setAffilatedUniversityBoardName(affilatedUniversityBoardName);
		    assertEquals(feedback.getAffilatedUniversityBoardName(), affilatedUniversityBoardName);
		  }
		
		@Test
		void testGetYearFromWhichAdmissionStarted() {
			String expected="2001";
			String actual=instMod.getYearFromWhichAdmissionStarted();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetYearFromWhichAdmissionStarted() {
		    String yearFromWhichAdmissionStarted="2001";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setYearFromWhichAdmissionStarted(yearFromWhichAdmissionStarted);
		    assertEquals(feedback.getYearFromWhichAdmissionStarted(), yearFromWhichAdmissionStarted);
		  }
		
		@Test
		void testGetPassword() {
			String expected="sacet";
			String actual=instMod.getPassword();
			assertEquals(expected,actual);
          }

		@Test
		  void testSetPassword() {
		    String password="sacet";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setPassword(password);
		    assertEquals(feedback.getPassword(), password);
		  }
		
		@Test
		void testGetAddressLine1() {
			String expected="Nayunipalli";
			String actual=instMod.getAddressLine1();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetAddressLine1() {
		    String addressLine1="Nayunipalli";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setAddressLine1(addressLine1);
		    assertEquals(feedback.getAddressLine1(), addressLine1);
		  }
		
		@Test
		void testGetAddressLine2() {
			String expected="Vetapalem";
			String actual=instMod.getAddressLine2();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetAddressLine2() {
		    String addressLine2="Vetapalem";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setAddressLine2(addressLine2);
		    assertEquals(feedback.getAddressLine2(), addressLine2);
		  }
		
		@Test
		void testGetCity() {
			String expected="Amaravati";
			String actual=instMod.getCity();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetCity() {
		    String city="Amaravati";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setCity(city);
		    assertEquals(feedback.getCity(), city);
		  }
		
		@Test
		void testGetState() {
			String expected="Andhra Pradesh";
			String actual=instMod.getState();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetState() {
		    String state="Andhra Pradesh";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setState(state);
		    assertEquals(feedback.getState(), state);
		  }
		
		@Test
		void testGetDistrict() {
			String expected="Amaravati";
			String actual=instMod.getDistrict();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetDistrict() {
		    String district="Amaravati";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setDistrict(district);
		    assertEquals(feedback.getDistrict(), district);
		  }
		
		@Test
		void testGetPinCode() {
			String expected="523146";
			String actual=instMod.getPincode();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetPinCode() {
		    String pinCode="523146";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setPincode(pinCode);
		    assertEquals(feedback.getPincode(), pinCode);
		  }
		
		@Test
		void testGetPrincipleName() {
			String expected="Gopala Rao";
			String actual=instMod.getPrincipleName();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetPrincipleName() {
		    String principleName="Gopala Rao";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setPrincipleName(principleName);
		    assertEquals(feedback.getPrincipleName(), principleName);
		  }
		
		@Test
		void testGetTelephone() {
			String expected="564123";
			String actual=instMod.getTelephone();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetTelephone() {
		    String telephone="564123";
		    InstituteModel feedback=new InstituteModel();
		    feedback.setTelephone(telephone);
		    assertEquals(feedback.getTelephone(), telephone);
		  }
		
		@Test
		void testGetStatus() {
			boolean expected=false;
			boolean actual=instMod.getStatus();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetStatus() {
		    boolean status=false;
		    InstituteModel feedback=new InstituteModel();
		    feedback.setStatus(status);
		    assertEquals(feedback.getStatus(), status);
		  }
		
		@Test
		void testGetFinalStatus() {
			boolean expected=false;
			boolean actual=instMod.getStatus();
			assertEquals(expected,actual);
          }
		@Test
		  void testSetFinalStatus() {
		    boolean finalStatus=false;
		    InstituteModel feedback=new InstituteModel();
		    feedback.setFinalStatus(finalStatus);
		    assertEquals(feedback.getFinalStatus(), finalStatus);
		  }
}
