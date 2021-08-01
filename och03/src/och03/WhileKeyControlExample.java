package och03;

public class  WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;		
		int speed = 50;
		int keyCode = 0;
		
		while(run) {
			// Enter Key 아니면 
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("-----------------------------");
	 			System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-----------------------------");
				System.out.print("선택: ");
			}
			keyCode = System.in.read();
			if (keyCode == 49) {       // ASCII Code -->1
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 50) { // ASCII Code -->2
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 51) { // ASCII Code -->3
				run = false;
			}
		}	
		
		System.out.println("프로그램 종료");
	}
}


