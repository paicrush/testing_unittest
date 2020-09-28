package com.unittest.testing;
public class Fahrenheit {
	private double celsius;
	
	public double getCelsius() {
		return celsius;
	}
	
	public void input(double celsius) {
		this.celsius = celsius;
	}
	
	public boolean isBound(double celsius) {
		boolean result;
		if(celsius >= -1000 && celsius <= 1000 ) {
			result = true;	
		}else {
			result = false;
		}
		return result;
	}
}