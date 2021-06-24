package com.te.Animals.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.Animals.beans.Pet;

@Configuration
@Import(AnimalConfig.class)
public class PetConfig {
	
	@Bean
	public Pet getPet() {
		Pet pet = new Pet();
		pet.setName("Jerry");
		return pet;
	}
}