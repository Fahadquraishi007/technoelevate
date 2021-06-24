package com.te.Animals;

import com.te.Animals.interfaces.Animal;

public class Panda implements Animal{

	@Override
	public void eat() {
		System.out.println(" Panda is chicken Tandoor ");
		
	}

	@Override
	public void speak() {
		System.out.println(" Huffing ...... ");
	}

}