package robotsim;

public class TestRobot {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot1= new Robot("robot1",5);
		Factory f= new Factory("test",null );
		f.addRobot("r1");
		f.addRobot("r2");
		f.addRobot("r3");
		
		System.out.println(f.checkRobotName("r3"));
		
		

	}

}
