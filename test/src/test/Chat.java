package test;

public class Chat extends Animal {
	private String couleur;
	public Chat(String name, int age) {
		super(name, age);
		this.couleur=couleur;
	}
	@Override
	public void faireDuBruit() {
		System.out.println("miole");
	}

}
