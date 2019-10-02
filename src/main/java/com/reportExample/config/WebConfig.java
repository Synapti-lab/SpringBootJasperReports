/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reportExample.config;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Marc Maschino, 2019
 */
@Configuration
public class WebConfig {
 
 @Bean(name = "db")
 @ConfigurationProperties(prefix = "spring.datasource")
 public DataSource dataSource() {
  return DataSourceBuilder.create().build();
 }

 @Bean(name = "jdbcTemplate")
 public JdbcTemplate jdbcTemplate(@Qualifier("db") DataSource ds) {
  return new JdbcTemplate(ds);
 }
}
