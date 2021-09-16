package exam02;

public interface RemoteControl {
	
	//상수 상수는 대문자선언 묵시적 약속
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//디폴트 메소드(JAVA8 추가)
	//OverRide 가능!!
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}
		else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	//정적메소드 (JAVA8 추가)
	//OverRide 불가능!!, class명으로 호출
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
	
	
}
