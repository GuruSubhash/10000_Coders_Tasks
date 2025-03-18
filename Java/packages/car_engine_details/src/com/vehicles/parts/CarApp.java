package com.vehicles.parts;

import com.vehicles.Car;
import com.vehicles.app.*;
import com.vehicles.parts.*;

public class CarApp {

	public static void main(String[] args) {
		Car c= new Car();
		c.setBrand("Toyota");
		c.setModel("A1");
		c.setPrice(999999);
		
		Engine eng= new Engine();
		eng.setEngineType("2_wheeler");
		eng.setHorsePower(66666);
		
		System.out.println(c.showCarDetails());
		System.out.println("------------------------------------------");
		System.out.println(eng.showEngineDetails());
	}
}
