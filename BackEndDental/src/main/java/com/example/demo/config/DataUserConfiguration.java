package com.example.demo.config;

import java.util.HashMap;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "userEntityManagerFactory",
    transactionManagerRef = "userTransactionManager", basePackages = {"com.example.demo.repository"})

public class DataUserConfiguration {
	 @Bean(name = "userDataSource")
	  @ConfigurationProperties(prefix = "user.datasource")
	  public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	  }

	  @Bean(name = "userEntityManagerFactory")
	  public LocalContainerEntityManagerFactoryBean userEntityManagerFactory(
	      EntityManagerFactoryBuilder builder, @Qualifier("userDataSource") DataSource dataSource) {
	    return builder.dataSource(dataSource).packages("com.example.demo.model").persistenceUnit("user")
	        .build();
	  }

	  @Bean(name = "userTransactionManager")
	  public PlatformTransactionManager userTransactionManager(
	      @Qualifier("userEntityManagerFactory") EntityManagerFactory userEntityManagerFactory) {
	    return new JpaTransactionManager(userEntityManagerFactory);
	  }

	}
