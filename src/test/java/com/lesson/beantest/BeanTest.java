package com.lesson.beantest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lesson.config.BeanConfiguration;
import com.lesson.data.People;

@SpringBootTest
class BeanTest {
	private ApplicationContext context;
	
	@BeforeEach
	public void setUp() {
		context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	}
	
	@AfterAll
	public void afterSetUp() {
		((AnnotationConfigApplicationContext) context).close();
	}
	
	@Test
	void testBean() {
		assertNotNull(context);
		
	}
	
	@SuppressWarnings("resource")
	@Test
	@DisplayName("test scenario for get bean")
	void testGetBean() {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		People po1 = context.getBean(People.class);
		People po2 = context.getBean(People.class);
		assertEquals(po1, po2);
	}
}
