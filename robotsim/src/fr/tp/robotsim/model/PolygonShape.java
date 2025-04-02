package fr.tp.robotsim.model;

import java.util.Set;

import fr.tp.inf112.projects.canvas.model.Vertex;

public class PolygonShape implements fr.tp.inf112.projects.canvas.model.PolygonShape {
	
	private Set<Vertex> vertices;
	
	public PolygonShape(Set<Vertex> vertices) {
		this.vertices=vertices;
	}

	@Override
	public Set<Vertex> getVertices() {
		// TODO Auto-generated method stub
		return this.vertices;
	}

}
