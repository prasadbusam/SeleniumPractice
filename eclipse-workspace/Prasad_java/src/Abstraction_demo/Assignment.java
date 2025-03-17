package Abstraction_demo;
interface vachicle
{
	public abstract void fueltype();
	public abstract void start();
	public abstract void stopEngine();
	
}

public class Assignment implements vachicle {
	public void fueltype()
	{
		System.out.println("start engine of car");
	}
	public void start() {
		System.out.println("start engine of bike");
	}
	public void stopEngine() {
		System.out.println("start engine of bus");
	}
	public static void main(String[] args) {
		Assignment obj=new Assignment();
		obj.fueltype();
		obj.start();
		obj.stopEngine();
	}

}
