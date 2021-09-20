package och12;

import javax.swing.JOptionPane;

class C1 extends Thread{
	@Override
	public void run() {
	
		for(int i = 0; i<10; i++) {
			System.out.print(i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//super.run();
	}
}

public class Threadtest6 {

	public static void main(String[] args) {
		C1 c =new C1();
		c.start();
		//				팝업창 
		String name = JOptionPane.showInputDialog("이건 무어냐");
		System.out.println("당신의 이름은 "+name+"입니다.");

	}

}
