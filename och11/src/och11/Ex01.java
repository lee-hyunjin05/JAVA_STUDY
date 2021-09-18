package och11;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> cha	 = new ArrayList<>();
		ArrayList<Integer> hap	 = new ArrayList<>();
	
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		cha.addAll(list1);	// 1, 2, 3, 4
		cha.removeAll(list2);	// 1, 2, 3, 4 - 3, 4, 5, 6 = 1, 2
		
		hap.addAll(cha);	// 1, 2
		hap.addAll(list2);	// + 3, 4, 5, 6 = 1, 2, 3, 4, 5, 6
		
		//즁복 허용이니까 add해서 숫자 겹쳐도 ㄱㅊㄱㅊ 막 1, 2, 3, 4, 3, 4, 5, 6 이렇게 나옴 ㄱㅊㄱㅊㅊ
		
		System.out.println("합집합 : " +hap);
		System.out.println("차집합 : " +cha);
	}

}
