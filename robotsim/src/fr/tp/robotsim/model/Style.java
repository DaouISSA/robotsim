package fr.tp.robotsim.model;

import fr.tp.inf112.projects.canvas.model.Color;
import fr.tp.inf112.projects.canvas.model.Stroke;

public class Style implements fr.tp.inf112.projects.canvas.model.Style {
	private Color color;
	private Stroke stroke;
	
	public Style(Color color, Stroke stroke) {
		this.color=color;
		this.stroke=stroke;
	}
	

	@Override
	public Color getBackgroundColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public Stroke getStroke() {
		// TODO Auto-generated method stub
		return this.stroke;
	}

}
