package och09;

import java.util.Calendar;

public class Calren1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //싱글턴으로 작성 되어 있는거
		int year 	= cal.get(Calendar.YEAR);
		int month	= cal.get(Calendar.MONTH)+1; //0월 부터라 +1
		int date 	= cal.get(Calendar.DATE);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다. \n", year, month, date);
		
		//int hour_12 = cal.get(Calendar.HOUR);//12시간
		int hour 	= cal.get(Calendar.HOUR_OF_DAY);//24시간 
		int min 	= cal.get(Calendar.MINUTE);
		int sec 	= cal.get(Calendar.SECOND);
		System.out.printf("지금은 %d시%d분%d초 입니다.\n",hour,min,sec);
		
		
		int dy1 = cal.get(Calendar.DAY_OF_MONTH);//월의 몇번째 날인가
		int dy2 = cal.get(Calendar.DAY_OF_YEAR);//년의 몇번째 날인가
		System.out.printf(dy1 + ", "+dy2);
	}

}
