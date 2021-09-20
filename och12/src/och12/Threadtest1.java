package och12;

//thread 만드는 첫번째 방법 : thread를 상속받기
class A1 extends Thread{
	public A1(String str) {
		super(str);//스레드 명 = str;
	}
	
	@Override 
	public void run() { //run : cpu에게 알려주는거 메모리 할당 준비가 다 되었다고
		for (int i = 1; i<=100; i++) {
			//					subA	+i
			System.out.print(getName() + i +"\t");
			if( i%10==0 ) System.out.println();//이건 그냥 보기 편하라고 10개씩 잘라쥰거
			try {
				Thread.sleep(50);//50/1000초를 쉬다가 반복
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				//e.printStackTrace();
			}
		}
		//super.run();
	}
	
}

public class Threadtest1 {

	public static void main(String[] args) {//멀티 스레딩

		A1 a1 = new A1("subA");//스레드 명 : subA
		A1 a2 = new A1("subB");
		a1.start();//메모리 상태에 올려줌 / 실행은 되지만 랜덤으로 할당 
		a2.start();
		a1.run();//cpu에 할당해달라고 요청 / 실행 더 빨리 /거의 들어온 순서대로
		a2.run();					//위에 얘네도 돌리고
		for(int i =1; i <=100;i++) {//메인도 돌리고 //위랑 메인이랑 서로 할당받은거 다음 따로 메모리 형성되고 돌아가는거
			System.out.print("Main "+i+"\t");
			if(i%10==0)System.out.println();
		}
	}
}
