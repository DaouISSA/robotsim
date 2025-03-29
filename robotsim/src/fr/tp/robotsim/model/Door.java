package fr.tp.robotsim.model;

public class Door extends Component {
	private boolean open;
	
	public Door(boolean open, Point position, double length,double width,String name,int id) {
		super(position, length, width, name,id);
		this.open=open;
	}
	
	

	
	

}
