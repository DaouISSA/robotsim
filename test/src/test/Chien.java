package test;

public class Chien extends Animal {
	public Chien(String name, int age) {
		super(name, age);	
	}
	@Override
	public void faireDuBruit() {
		System.out.println("aboie");
	}
	

}
