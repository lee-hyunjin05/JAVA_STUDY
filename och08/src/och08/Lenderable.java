package och08;

public interface Lenderable {
	
	int BORROW = 1;
	int NORMAL = 0;
	// 상수 : 소문자로 해도 에러 안나지만, 대문자가 묵시적약속
	
	void checkOut(String borrower, String date);
	void checkin();
}

class SepperateVolume implements Lenderable{

	String title;
	String date;
	String borrower;
	int status;		// BORROW, NOMAL값이 들어올 예정 //디폴드값=0;
	
	SepperateVolume(String title){
		this.title = title;
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		// NOMAL --> 0, 빌려갈 수 없는 상태
		if(status != NORMAL) {
			System.out.println(borrower + "(이)가 "+date + "일에 " + title + "을 대여 할 수 없음.");
			return;
		}
		this.date		= date;
		this.borrower	= borrower;
		status			= BORROW; // 1로 전환 
		//BORROW = 1; 안됨
		System.out.println(borrower + "(이)가 "+date + "일에 " + title + "을 대여했다.");
		
	}

	@Override
	public void checkin() {
		// 현재 빌려간 상태가 아니면(1이 아니면), return
		if (status != BORROW) return;
		System.out.println(borrower + "(이)가 "+ title + "을 반납했다.");
		date		= null;
		//title		= null;
		borrower	= null;
		status		= NORMAL;
		
	}
	
}