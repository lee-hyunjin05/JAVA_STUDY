package och11;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		String [] pet = {"지렁이", "거미", "개미", "굼벵이", "고릴라"};
		Stack<String> st = new Stack<String>();
		
		for(String str : pet) {
			System.out.println("push ->" +str);
			st.push(str); //push는 순서대로 들어감
		}
		System.out.println("-----------------------------");
		
		while(!st.isEmpty()) {
			System.out.println("POP -> "+st.pop()); //pop꺼내면 스택은 후입선출이라 거꾸로 나오는거
		}
		//나머지 속성은 리스트계열이랑 똑같은데 후입선출이 스택이다
		//선입선출은 큐
	}

}
