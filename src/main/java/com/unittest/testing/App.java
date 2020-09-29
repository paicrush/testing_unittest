package com.unittest.testing;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("input celsius :");
        double celsius = input.nextDouble();
        Fahrenheit f = new Fahrenheit();
        while(!f.isBound(celsius)) {
        	 System.out.println("input celsius Again!");
        	 System.out.print("input celsius :");
             celsius = input.nextDouble();
        }
        f.input(celsius);
        System.out.println(f.toString());
    }
}