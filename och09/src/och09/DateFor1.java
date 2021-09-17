package och09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFor1 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");//M : month, m : minute ??SSS : 밀리세컨드
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); //H, h 관계 x // a : 오전 오후
		
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		sdf8 = new SimpleDateFormat("오늘은 이 달의 M번째 주입니다.");
		sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");
		
		System.out.println("sdf1 -> "+sdf1.format(today));
		//format(Date d)
		System.out.println("sdf2 -> "+sdf2.format(today));
		System.out.println("sdf3 -> "+sdf3.format(today));
		System.out.println("sdf4 -> "+sdf4.format(today));
		System.out.println();
		System.out.println("sdf5 -> "+sdf5.format(today));
		System.out.println("sdf6 -> "+sdf6.format(today));
		System.out.println("sdf7 -> "+sdf7.format(today));
		System.out.println("sdf8 -> "+sdf8.format(today));
		System.out.println("sdf9 -> "+sdf9.format(today));
		

	}

}