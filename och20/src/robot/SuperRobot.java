package robot;

import robot.actions.FireOk;
import robot.actions.FlyOk;
import robot.actions.KnifeLazer;

public class SuperRobot extends Robot {

	public SuperRobot() {
		flyAction = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeLazer();
	}
	
	@Override
	public void shape() {
		System.out.println("걷고, 달리고, 날 수 있습니다.");
	}

}
