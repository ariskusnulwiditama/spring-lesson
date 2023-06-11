package com.lesson.beantest;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lesson.config.BeanConfiguration;

public class ApplicationContextTest {
	
	@Test
	void testApplicationContext() {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Assertions.assertNotNull(context);
	}
}
