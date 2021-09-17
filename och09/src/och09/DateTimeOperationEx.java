package och09;

import java.time.LocalDateTime;

public class DateTimeOperationEx {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 시각  : "+now);
		LocalDateTime targetDateTime = now.plusYears(1)
										.minusMonths(2)
										.plusDays(3)
										.plusHours(4)
										.minusMinutes(5)
										.plusSeconds(6); //날짜에 대한 가공이 편함
		System.out.println("연산 후 : "+targetDateTime);
		
	}
}
