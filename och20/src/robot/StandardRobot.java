package robot;

import robot.actions.FireOk;
import robot.actions.FlyNo;
import robot.actions.KnifeWood;

public class StandardRobot extends Robot {
	
	//일반인 Robot
	StandardRobot(){
		flyAction = new FlyNo();
		fireAction = new FireOk();
		knifeAction = new KnifeWood();
	}
	
	@Override
	public void shape() {
		System.out.println("걷고, 달릴 수 있다.");

	}

}
