package fr.tp.robotsim.model;

import java.util.ArrayList;
public class ProductionArea extends Component {
	private ArrayList<Engine> engines;
	
	public ProductionArea( ArrayList<Engine> engines, Point position, double length,double width,String name,int id ) {
		super(position, length,width,name, id);
		this.engines= engines;
	}
	
	

}
