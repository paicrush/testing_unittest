package com.unittest.testing;
public class Fahrenheit {
	private double celsius;
	private double fahrenheit;
	
	public double getFahrenheit() {
		return fahrenheit;
	}

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
	
	public void calculate() {
		this.fahrenheit = this.celsius*9/5+32; 

	}
	public String toString() {
		double fahrenheit = this.getFahrenheit();
		double celcius = this.getCelsius();
		return Math.round(celcius)+" celcius = "+String.format("%.2f",fahrenheit)+" fahrenheit";
	}
}