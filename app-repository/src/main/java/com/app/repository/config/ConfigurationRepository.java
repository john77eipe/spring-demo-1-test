package com.app.repository.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.app.repository.*")
@ComponentScan(basePackages = { "com.app.repository.*" })
public class ConfigurationRepository {

}