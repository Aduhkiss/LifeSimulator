package me.atticuszambrana.lifesim;

import java.util.Scanner;

import me.atticuszambrana.lifesim.gen.PersonGenerator;
import me.atticuszambrana.lifesim.player.Person;

public class Start {
	static Scanner sc = null;
	public static void main(String[] args) {
		// Lets get everything ready first.
		PersonGenerator generator = new PersonGenerator();
		
//		// Testing
//		for(int i = 0; i < 1; i++) {
//			Person p = generator.generate();
//			System.out.println("Name: " + p.getName() + ", Gender: " + p.getGender());
//		}
	}
	
//	List<String> names = new ArrayList<String>();
//	
//	for(String i : args) {
//		names.add(i);
//	}
//	
//	Gson g = new Gson();
//	System.out.println(g.toJson(names));
}
