package com.irbisrestserv.irb;

import com.irbisrestserv.irb.repository.CardRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;


@SpringBootApplication
@EnableSolrRepositories(basePackageClasses = CardRepository.class)
public class IrbApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrbApplication.class, args);
	}



}
