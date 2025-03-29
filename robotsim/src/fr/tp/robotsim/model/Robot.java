package fr.tp.robotsim.model;

public class Robot extends Component {
	private double speed;
	
	public Robot( double speed, Point position, double length,double width,String name,int id) {
		super(position,length,width,name, id);
		this.speed = speed;
	}

}