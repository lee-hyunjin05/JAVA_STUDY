package och16;

import java.io.File;

public class Dir1 {

	public static void main(String[] args) {
		// 현재 위치 "."
		// ".." 상위폴더로 이동
		//File file = new File(".");
		//File file = new File("src/och16/");
		File file = new File("../och13/src/exam01");
		
		
		
		String[] list = file.list();
		for(String str:list) {
			System.out.println(str);
		}
	
	}

}
