package com.vehicles.app;

public class Engine {

	private String engineType;
	private int horsePower;
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public String showEngineDetails() {
		return "Engine [engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
}
