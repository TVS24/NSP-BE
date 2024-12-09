package com.wipro.velocity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.wipro.velocity.model.NodalModel;

import org.junit.jupiter.api.Test;

public class NodalModelTest {
	
NodalModel nodMod = new NodalModel("officer", "government");

@Test
void GetNodalId() {
	String expected="officer";
	String actual=nodMod.getNodalId();
	assertEquals(expected,actual);
  }
@Test
void SetNodalId() {
	String nodalId="tvs";
	NodalModel feedBack =new NodalModel();
	feedBack.setNodalId(nodalId);
	assertEquals(feedBack.getNodalId(),nodalId);
}

@Test
void GetPassword() {
	String expected="government";
	String actual=nodMod.getPassword();
	assertEquals(expected,actual);
  }
@Test
void SetPassword() {
	String password="tvs123";
	NodalModel feedBack =new NodalModel();
	feedBack.setPassword(password);
	assertEquals(feedBack.getPassword(),password);
}
}

