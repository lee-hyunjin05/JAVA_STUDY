package och11;

import java.util.Vector;

public class Vector3 {
	
	public static void print(Vector<String>v) {
		System.out.println(v);
		System.out.println("size : "+v.size());
		System.out.println("capacity : "+v.capacity());
	}
	
	public static void main(String[] args) {
		//	제네릭<> --> Generics(관련형만 들어 와라)
		Vector<String> v = new Vector<>(5); //용량 (5) : 알아서 용량을 조절해줌 범위 넘으면 *2배씩 늘어난다.
		v.add("1");
		// v.add(2); > 제네릭 스트링 했으니까 스트링으로만 받을 수 있음 얜 인트
		v.add("3");
		v.add("4");
//		v.add("5");
//		v.add("6");
//		v.add("7");
//		v.add("8");
//		v.add("9");
//		v.add("10");
//		v.add("11");
//		v.add("12");
		
		print(v);
		
		//ensureCapacity 용량을 Clear
		v.trimToSize();//딱 값 크기에 맞게 용량을 줄여쥼
		System.out.println("=== After trimToSize() ====");
		print(v);
		
	}

}
