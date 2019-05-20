package com.app.repository.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;

@Configuration
@EnableJpaRepositories("com.app.repository.*")
@ComponentScan(basePackages = { "com.app.repository.*" })
public class ConfigurationRepository {

}