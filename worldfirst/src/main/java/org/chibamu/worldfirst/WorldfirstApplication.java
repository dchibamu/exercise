package org.chibamu.worldfirst;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorldfirstApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WorldfirstApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RegistrationContext registrationContext = new RegistrationContext();
		registrationContext.createCustomer();
	}
}
