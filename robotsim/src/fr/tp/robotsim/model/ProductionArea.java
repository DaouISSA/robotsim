package fr.tp.robotsim.model;

import java.util.ArrayList;
public class ProductionArea extends Component {
	private ArrayList<Engine> engines;
	
	public ProductionArea( ArrayList<Engine> engines, Point position, double length,double width,String name,int id ) {
		super(position, length,width,name, id);
		this.engines= engines;
	}
	
	public boolean checkEngineId(Engine e) {
		for(Engine myEngine: engines) {
			if(myEngine.getId()==e.getId()) {
				return true;
			}
		}
		return false;
	}
	public boolean addEngine(Engine e) {
		if(this.checkEngineId(e)==false) {
			engines.add(e);
			return true;
		}
		return false;
	}
	public void toConsole() {
		for(Engine myengine: engines) {
			System.out.println(myengine.getName());
		}
	}
	
}
