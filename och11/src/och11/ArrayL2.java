package och11;

import java.util.ArrayList;

public class ArrayL2 {
	
	public static void print(ArrayList<String> list) {
		// 				수박 사과 바나나 수박 대추 바나나
		//입력한 순서 유지하면서 올라감
		for(String str : list) {
			System.out.printf(str + "\t");
		}
		System.out.println("\n---------------------------------------------");
	}
	

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("수박");//[0]
		list.add("사과");
		list.add("바나나");
		list.add("수박");
		list.add("대추");
		list.add("바나나");

		System.out.println("갯수 : "+list.size());
		print(list);
		
		//1번 자리에 끼워 넣기가 가능하다.
		list.add(1,"키위");//배열보다 유연함 배열은 넣으려면 다 바꿔줘야되는데, 얘는 끼워넣는거 됨
		print(list);		//하ㅣ나 들어오고 자리 밀리는거
		list.set(4,"복숭아");//얘는 걍 4자리 값을 바꿔주는
		print(list);
		list.remove(0);//지워줌 수박 사라졋ㅇ
		print(list);
		System.out.println("3번 인덱스 --> "+ list.get(3));//인덱스의 원소를 가져 오는 거 
		System.out.println("바나나 문의 : "+ list.contains("바나나"));//바나나 포함하는지 yes! -> 리턴값이 true로 나왔으니까 부울인가범
		System.out.println("바나나 문의 : "+list.indexOf("바나나"));//순차적으로 맨 앞에 있는걸 읽어드리는
		System.out.println("바나나 문의 : "+list.lastIndexOf("바나나"));//last>> 마지막꺼 읽어주는
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).equals("바나나")) { //바나나면
				list.set(i, "딸기");				// 딸기로 바꿔라ㄴ
			}
		}
		print(list);
	}

}
