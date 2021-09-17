package och09;

public class Math1 {

	public static void main(String[] args) {
		
		int[] i = new int[6];
		
		// random 0이상 1미만의 실수*
		for(int j=0; j<6;j++) {		//random()*숫자 =  숫자 이하의 수 중 랜덤한 수
			int i1 = (int) (Math.random()*45)+1; //45미만이라 45+1로 해서 45도 추가해준
			i[j] = i1;
		}
		for(int j = 0; j < i.length ; j++) {
			System.out.println(":" + i[j]);
		}
	}//로또 번호 생성기

}
