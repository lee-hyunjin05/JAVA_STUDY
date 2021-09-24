package robot;

import robot.actions.FireAction;
import robot.actions.FlyAction;
import robot.actions.KnifeAction;

public abstract class Robot { //추상 클래스는 인스턴스화 불가능
	public FlyAction flyAction;
	public FireAction fireAction;   // 인터페이스 선언만 해놓고, 메모리에 아직 올라간거 X
	public KnifeAction knifeAction;
	
	public Robot() { //생성자
		// TODO Auto-generated constructor stub
	}
	// 나를 상속받는 Class여 -> 구현하라
	//추상 클래스엔 반드시 하나 이상의 추상 메서드 존재해야함
	//추상클라스의 자손 클라스는 반드시 추상메소드 구현해야함
	public abstract void shape();
	
	public void actionFly() {
		// TODO Auto-generated constructor stub
		flyAction.fly();
	}		
	public void actionFire() {
		// TODO Auto-generated constructor stub
		fireAction.fire();
	}
	public void actionKnife() {
		knifeAction.knife();
	}
	
	public void actionBasic() {
		// TODO Auto-generated constructor stub
		System.out.println("팔,다리,머리,몸통 존재");	
}
	public void setFlyAction(FlyAction flyAction) {
		this.flyAction = flyAction;
	}
	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}//private 로 써준건 아닌데 머였지 나중에 변경해 버릴 지도 모르니까 정의해 준
	public void setKnifeAction(KnifeAction knifeAction) {
		this.knifeAction = knifeAction;
	}
		
	
}
	
