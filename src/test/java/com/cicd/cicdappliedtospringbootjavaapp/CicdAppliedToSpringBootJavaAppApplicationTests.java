package com.cicd.cicdappliedtospringbootjavaapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cicd.cicdappliedtospringbootjavaapp.controller.HelloController;

@SpringBootTest(classes=CicdAppliedToSpringBootJavaAppApplication.class)
class CicdAppliedToSpringBootJavaAppApplicationTests {
	
	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
		Assertions.assertEquals("Hello, World From DZONE", helloController.home());
	}

}
