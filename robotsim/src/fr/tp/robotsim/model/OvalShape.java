package fr.tp.robotsim.model;

public class OvalShape extends Shape implements fr.tp.inf112.projects.canvas.model.OvalShape  {
	private int width;
	private int height;
	
	public OvalShape(int width, int height) {
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

	public void setHeight(int height) {
		this.height = height;
	}

}
