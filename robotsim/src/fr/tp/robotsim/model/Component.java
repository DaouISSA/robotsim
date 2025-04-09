package fr.tp.robotsim.model;

import fr.tp.inf112.projects.canvas.model.Figure;
import fr.tp.inf112.projects.canvas.model.Shape;
import fr.tp.inf112.projects.canvas.model.Style;

public class Component implements Figure {
	private String name;
	private Shape shape;
	private String  id;
	private Vertex vertex;
	private Style style;
	
	public Component(String name, Shape shape, String id, Vertex vertex, Style style) {
		this.name=name;
		this.shape=shape;
		this.id=id;
		this.vertex=vertex; 
		this.style=style;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getxCoordinate() {
		// TODO Auto-generated method stub
		return vertex.getxCoordinate();
	}

	@Override
	public int getyCoordinate() {
		// TODO Auto-generated method stub
		return vertex.getyCoordinate();
	}

	@Override
	public Style getStyle() {
		// TODO Auto-generated method stub
		return this.style;
	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return this.shape;
	}
	
	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setVertex(Vertex vertex) {
		this.vertex = vertex;
	}

	public void setStyle(Style style) {
		this.style = style;
	}
	
	

}
