package robotsims;

public class Robot {
	private String name;
	private double speed;
	
	public Robot(String name, double speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "je m'appelle "+ name + " et j'avance à "+ this.speed  + " Km/h";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	
	

}
