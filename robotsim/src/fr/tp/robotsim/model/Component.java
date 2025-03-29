package fr.tp.robotsim.model;

public abstract class Component {
	
	private Point position;
	private double length;
	private double width;
	private String name; 
	private int id;
	
	public Component(Point position, double length,double width,String name,int id ) {
		this.position=position;
		this.length=length;
		this.width= width;
		this.name=name;
		this.id=id;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	
	
	
	
	

}
