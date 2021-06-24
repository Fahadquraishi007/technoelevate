package com.te.Animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.Animals.beans.Pet;
import com.te.Animals.configurations.PetConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PetConfig.class);
		Pet pet = applicationContext.getBean(Pet.class);
		
		System.out.println(pet.getName());
		pet.getAnimal().speak();
		pet.getAnimal().eat();
	}
}