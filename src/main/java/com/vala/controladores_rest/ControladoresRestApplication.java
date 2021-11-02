package com.vala.controladores_rest;

import com.vala.controladores_rest.Entities.Laptop;
import com.vala.controladores_rest.Repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ControladoresRestApplication {

	public static void main(String[] args) {

		ApplicationContext cont =
				SpringApplication.run(ControladoresRestApplication.class, args);
		LaptopRepository repo = cont.getBean(LaptopRepository.class);


		Laptop laptop = new Laptop(null, "name", true);

		repo.save(laptop);
	}


}
