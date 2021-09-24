package robot.actions;

public class FireOk implements FireAction {
	
	//추상메소드 반드시 오버라이드
	@Override
	public void fire() {
		System.out.println("미사일 발사");
	}

}
