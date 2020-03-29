package com.bank.springhibernate;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAndHibernateApplicationTests {

	@Test
	public void contextLoads() {
		// then
		assertEquals(3,3);
	}
	@Test
	public void contextLoads2() {
		// then
		assertEquals(3,3);
	}
}

