package com.wipro.velocity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wipro.velocity.model.MinistryModel;

import org.junit.jupiter.api.Test;

public class MinistryModelTest {

	MinistryModel minMod=new MinistryModel("minister", "government");
	
	@Test
	void GetMinistryIdTest() {
		String expected="minister";
		String actual=minMod.getMinistryId();
		assertEquals(expected,actual);
		}
	
	@Test
	void SetMinistryIdTest() {
		String ministryId="minister";
		MinistryModel feedback=new MinistryModel();
		feedback.setMinistryId(ministryId);
		assertEquals(feedback.getMinistryId(),ministryId);
	}
	
	@Test
	void GetPassword() {
		String expected="government";
		String actual=minMod.getPassword();
		assertEquals(expected,actual);
		}
	
	@Test
	void SetPassword() {
		String password="government";
		MinistryModel feedback=new MinistryModel();
		feedback.setPassword(password);
		assertEquals(feedback.getPassword(),password);
	}
}
