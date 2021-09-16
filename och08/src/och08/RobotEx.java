package och08;

public class RobotEx {
	
	static void action(Robot r) {
		
		if( r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		}
		else if(r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
		else {
			//((SingRobot) r).sing(); 이거 풀어쓰면 밑에꺼
			SingRobot sr = (SingRobot) r;
			sr.sing();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] rb = new Robot[3];
		rb[0] = new DanceRobot();
		rb[1] = new DrawRobot();
		rb[2] = new SingRobot();
		
		for(Robot r : rb) {
			action(r);
		}
	}

}
