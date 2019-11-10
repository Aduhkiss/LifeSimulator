package me.atticuszambrana.lifesim.player;

import me.atticuszambrana.lifesim.gen.PersonGenerator;

public class LivingEntity {
	
	private String name;
	private int age;
	private boolean isAlive;
	private Gender gender;
	protected PersonGenerator gen;
	
	public LivingEntity(String name, Gender gender) {
		
		this.name = name;
		this.age = 0;
		this.isAlive = true;
		this.gender = gender;
		this.gen = new PersonGenerator();
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean isAlive() {
		return isAlive;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public enum Gender {
		BOY,
		GIRL,
	}
}
