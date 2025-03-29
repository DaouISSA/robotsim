package fr.tp.robotsim.model;

import java.util.ArrayList;

public class FactoryAndConstituants {
	private Factory usine;
	private ArrayList<Engine> machines;
	private ArrayList<Room> salles;
	private ArrayList<Pucks> rondelles;
	private ArrayList<Station> stations;
	
	public FactoryAndConstituants(Factory usine, ArrayList<Engine> machines, ArrayList<Room> salles, ArrayList<Pucks> rondelles, ArrayList<Pucks> station) {
		this.usine= usine;
		this.machines = machines;
		this.salles= salles;
		this.rondelles=rondelles;
		this.stations= stations;
	}

	@Override
	public String toString() {
		return "FactoryAndConstituants [usine=" + usine + ", machines=" + machines + ", salles=" + salles
				+ ", rondelles=" + rondelles + ", stations=" + stations + "]";
	}

	
	
	

}
