package och12;

class Account2User extends Thread{
	
	Account2 act;
	boolean flag;
	
	public Account2User (Account2 act, String name) {
		super(name);
		this.act = act;
	}
	@Override
	public void run() {

		for(int i = 0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			//공유부분
			//민감한 객체를 공유할 떄는 싱크로나이즈드를 걸어주는게 좋다 
			synchronized (act) {//계좌 객체가 있다면~~
				if(flag) { //true 예금 만원 '미만'
					act.deposit((int)(Math.random()*10000), getName());
				}
				else {	//false 출금
					act.withdraw((int)(Math.random()*10000), getName());
				}
				flag = !flag; //flag SWAPs //입금 출금 반복하겠다고 한번 참이면 거짓을 
			}
		}
		
		super.run();
	}
}




public class Account2Ex {

	public static void main(String[] args) {
		//		몬테크리스토
		Account2 act = new Account2(10000);
		// 		 BTS
		Account2 act2 = new Account2(15000);
		//								같은 계좌를 사용
		Account2User au1 = new Account2User(act, "옥주현");
		Account2User au2 = new Account2User(act, "김소현");
		Account2User au3 = new Account2User(act, "정선아");
		Account2User au4 = new Account2User(act2, "rm");
		Account2User au5 = new Account2User(act2, "뷔");
		Account2User au6 = new Account2User(act2, "정국");
		
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
		au6.start();
		
		
		
		
	}

}
