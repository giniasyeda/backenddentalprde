//package com.example.demo.config;
//
//import java.lang.reflect.Member;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import com.example.demo.model.PatientsInfo;
//import com.zaxxer.hikari.HikariDataSource;
//
//public class PatientsDataSource {
//
//	 @Bean
//	    @Primary
//	    @ConfigurationProperties("app.datasource.patients")
//	    public DataSourceProperties memberDataSourceProperties() {
//	        return new DataSourceProperties();
//	    }
//	    @Bean
//	    @Primary
//	    @ConfigurationProperties("app.datasource.patients.configuration")
//	    public DataSource patientsDataSource() {
//	        return memberDataSourceProperties().initializeDataSourceBuilder()
//	                .type(HikariDataSource.class).build();
//	    }
//	    @Primary
//	    @Bean(name = "patientsEntityManagerFactory")
//	    public LocalContainerEntityManagerFactoryBean patientsEntityManagerFactory(EntityManagerFactoryBuilder builder) {
//	        return builder
//	                .dataSource(patientsDataSource())
//	                .packages(PatientsInfo.class)
//	                .build();
//	    }
//	    @Primary
//	    @Bean
//	    public PlatformTransactionManager memberTransactionManager(
//	            final @Qualifier("memberEntityManagerFactory") LocalContainerEntityManagerFactoryBean memberEntityManagerFactory) {
//	        return new JpaTransactionManager(memberEntityManagerFactory.getObject());
//	    }
//	}
