package com.app.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import com.app.repository.config.ConfigurationRepository;


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
//@ContextConfiguration(classes= {ConfigurationRepository.class})
//the above context configuraiton needs to be used instead of @SpringBootApplicaiton 
//but yet to figure it out
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

    @Test
    public void testCount2() {
    	Assertions.assertNotNull(myBeanRepository , "Data on demand for 'Topping 2' failed to initialize correctly");
    }
   
}