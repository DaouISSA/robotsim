package fr.tp.robotsim.model;

public class Vertex implements fr.tp.inf112.projects.canvas.model.Vertex {
	
	private int x;
	private int y;
	
	public Vertex(int x, int y) {
		this.x=x;
		this.y=y;
		
	}

	@Override
	public int getxCoordinate() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public int getyCoordinate() {
		// TODO Auto-generated method stub
		return this.y;
	}

}
