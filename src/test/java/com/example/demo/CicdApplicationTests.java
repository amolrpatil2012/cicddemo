package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class CicdApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Testing ");
		assertEquals(true, true);
	}

}
