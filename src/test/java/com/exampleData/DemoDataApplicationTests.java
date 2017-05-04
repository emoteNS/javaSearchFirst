package com.exampleData;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoDataApplicationTests {

	@Autowired
	AirportRepository airportRepository;


	@Test
	public void contextLoads() {

		//airportRepository.save(new Airport());

		//airportRepository.findByIataLike("");

	}

}
