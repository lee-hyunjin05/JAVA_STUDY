package exam02;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(false); //아버지
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true); //override한 오디오의 
		
		//RemoteControl.changeBattery();
		
	}

}
