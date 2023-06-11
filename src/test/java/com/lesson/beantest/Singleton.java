package com.lesson.beantest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lesson.data.Database;

public class Singleton {

	@Test
	void testSingleton() {
		var db1 = Database.getInstance();
		var db2 = Database.getInstance();
		
		Assertions.assertSame(db1, db2);
	}
}
