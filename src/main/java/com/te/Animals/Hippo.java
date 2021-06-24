package com.te.Animals;

import com.te.Animals.interfaces.Animal;

public class Hippo implements Animal{

	@Override
	public void eat() {
		System.out.println("Hippo eats matar paneer");
		
	}

	@Override
	public void speak() {
		System.out.println(" Roaring..... ");
	}

}