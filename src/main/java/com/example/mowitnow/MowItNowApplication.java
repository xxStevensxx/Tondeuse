package com.example.mowitnow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mowitnow.model.Garden;

@SpringBootApplication
public class MowItNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(MowItNowApplication.class, args);
		
		
		Garden garden = new Garden();
			System.out.println( "La surface de mon jardin est de: " + garden.gardenSurface(120, 30) + " cm.");
			
			
					for (int i = 0; i < garden.getX(); i++) {
						
						System.out.println("la hauteur de mon jardin est de : " + garden.getX());
						
					}
		
			
	}

}
