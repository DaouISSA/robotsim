package robotsim;

public class Robot {
	
	private String name;
	private double speed;
	
	
	
	public String getName() {
		return name;
	}


	public double getSpeed() {
		return speed;
	}
	

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public Robot(String name, double speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Je m'appelle " + name + " et j'avance à "+speed+"km/h";
	}
	
	
	

}
