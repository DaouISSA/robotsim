package fr.tp.robotsim.model;

public class Color implements fr.tp.inf112.projects.canvas.model.Color {
	
	private int red; 
	private int green;
	private int blue;
	
	
	public Color(int red, int green, int blue) {
		this.red=red;
		this.green=green;
		this.blue=blue;
	}

	@Override
	public int getRedComponent() {
		// TODO Auto-generated method stub
		return 0xFF0000;
	}

	@Override
	public int getGreenComponent() {
		// TODO Auto-generated method stub
		return 0x00FF00;
	}

	@Override
	public int getBlueComponent() {
		// TODO Auto-generated method stub
		return 0x0000FF;
	}

}
