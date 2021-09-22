package och16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer1 {

	public static void main(String[] args) throws IOException {
		//char String 으로 부터 객체를 읽어들이는 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("이름은 ?");
		String name = br.readLine();
		System.out.println("주소는 ?");
		String addr = br.readLine();
		System.out.println(name+ "님은 "+addr+ "에 사시는 군요.");
		
	}
}
