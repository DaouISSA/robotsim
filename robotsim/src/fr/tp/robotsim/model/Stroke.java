package fr.tp.robotsim.model;

import fr.tp.inf112.projects.canvas.model.Color;

public class Stroke implements fr.tp.inf112.projects.canvas.model.Stroke {
	
	private Color color;
	private float thickness;
	private float[] dashPattern;
	
	public Stroke( Color color, float thickness, float[] dahPattern) {
		this.color= color;
		this.thickness=thickness;
		this.dashPattern= dashPattern;
		
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

	@Override
	public float getThickness() {
		// TODO Auto-generated method stub
		return this.thickness;
	}

	@Override
	public float[] getDashPattern() {
		// TODO Auto-generated method stub
		return this.dashPattern;
	}

}
