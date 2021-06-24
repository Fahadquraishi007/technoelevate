package com.te.Animals.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.Animals.Hippo;
import com.te.Animals.Panda;
import com.te.Animals.interfaces.Animal;

@Configuration
public class AnimalConfig {

	@Bean("panda")
	public Animal getPanda() {
		return new Panda();	
	}
	
	@Bean("hippo")
	public Animal getHippo() {
		return new Hippo();
	}
}