package com.example.mowitnow.model;

public class Garden {
	
	public Garden(int x, int y) {
		this.x = x;
		this.y = y;
	};
	
	public Garden() {};

	
	/* 
	 * y Ordonée ligne verticale
	 * x Abscisse ligne horizontale
	 */
	
	private int x;
	private int y;
		
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public int gardenSurface(int y, int x) {
		return x * y;
	}
		
}
