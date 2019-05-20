package com.app.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


/**
 * @ExtendWith(SpringExtension.class) 		// this is not needed because DataJpaTest has it
 * @RunWith(SpringJUnit4ClassRunner.class) 	// this is not needed because we are not using JUnit 4.x
 * @EntityScan("my.package.base.*")   		// might be needed when run directly usign server instead of embedded
 * @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
 * 											// may use it
 * @author johne
 * 
 * https://www.baeldung.com/spring-5-junit-config
 * 
 *
 */

@DataJpaTest
public class MyBeanIntegrationTest {

    @Autowired
    MyBeanRepository myBeanRepository;

    @Test
    public void testMarkerMethod() {
    }

    @Test
    public void testCount() {
    	Assertions.assertNotNull(myBeanRepository , "Data on demand for 'Topping' failed to initialize correctly");
    }

   
}