package com.wipro.velocity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.wipro.velocity.controller.MinisterController;
import com.wipro.velocity.model.MinistryModel;
import com.wipro.velocity.model.NodalModel;
import com.wipro.velocity.model.StudentApplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;



@SpringBootTest
@TestPropertySource(properties = "spring.mongodb.embedded.version=3.5.5")
public class MinisterControllerTest {
	
	@Autowired
	private MinisterController minCtrl;
	
	@Test
    public void testMinisterLogin(){
		MinistryModel minMod=new MinistryModel();
		minMod.setMinistryId("minister");
		minMod.setPassword("government");
		assertEquals(minCtrl.loginMinister(minMod),true);
	}
	
	@Test
	public void testGetInstituteAppliations() {
		assertNotEquals(minCtrl.getAllInstitutions(),0);
	}
	
	@Test
	public void testGetStudentAppliations() {
		assertNotEquals(minCtrl.getAllStudents(),0);
	}
	
	@Test
	public void testUpdateStudentStatus() {
		
		StudentApplication stuApp=new StudentApplication();
		stuApp.setStatus(true);
		assertNotEquals(minCtrl.updateFinalStatus("250108065353", stuApp),true);
	}
	
	@Test
	public void testGetById() {
		
		StudentApplication stuApp=new StudentApplication();
		stuApp.setEmail("venkatasaitatikonda2000@gmail.com");
		assertNotEquals(minCtrl.getStudentById("venkatasaitatikonda2000@gmail.com"),true);
	}

	

}
