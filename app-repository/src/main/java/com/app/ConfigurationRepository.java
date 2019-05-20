package com.app;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
/**
@SpringBootApplication
this annotation wouldn't be there for non-boot packages/sub-projects like this one
@EnableJpaRepositories("com.app.repository.*")
//https://springbootdev.com/2017/11/13/what-are-the-uses-of-entityscan-and-enablejparepositories-annotations/
**/

@ComponentScan(basePackages = { "com.app.repository.*" })
public class ConfigurationRepository {

}
