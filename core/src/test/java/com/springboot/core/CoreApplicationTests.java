package com.springboot.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.core.service.PaymentService;
import com.springboot.core.service.PaymentServiceImpl;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentServiceImpl paymentService;
	
	@Test
	public void TestDependencyInjection() {
		assertNotNull(paymentService.getDao());
	}

	
}
