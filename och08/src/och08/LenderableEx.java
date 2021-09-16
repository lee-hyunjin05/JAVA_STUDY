package och08;

public class LenderableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SepperateVolume sv = new SepperateVolume("젊은 베르데르의 슬픔");
		sv.checkOut("정승환/박윤하", "2021/04/01");
		sv.checkOut("조정석", "2021/04/01");
		sv.checkin();
		sv.checkOut("조정석", "2021/04/05");
	}

}
