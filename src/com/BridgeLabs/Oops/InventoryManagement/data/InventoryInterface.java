package com.BridgeLabs.Oops.InventoryManagement.data;

public interface InventoryInterface {
	
	public  void add(String name,double weight, double price);
	public void remove(String name, double weight);
	public double calculate(double price);
	public void writeFile();

}
