package fr.tp.robotsim.model;

public class RectangleShape implements fr.tp.inf112.projects.canvas.model.RectangleShape {
	private int width;
	private int height;
	
	public RectangleShape(int width,int height) {
		this.width=width;
		this.height=height;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

}
