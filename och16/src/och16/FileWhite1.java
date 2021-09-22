package och16;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWhite1 {

	public static void main(String[] args) throws IOException {

		Scanner sc =  new Scanner(System.in);
		System.out.println("출력할 파일명");
		String fileName = sc.nextLine();
		System.out.println("저장할 글을 입력하세요.");
		String msg = sc.nextLine();
		//1. Open //파일을 쓰겠다는 객체
		FileWriter fw = new FileWriter(fileName);
		Date date = new Date();
		//2. 쓸 내용을 채움
		fw.write(date+": "+msg);
		//3. File을 닫음
		fw.close(); //반드시 해야 함 안하면 파일이 저장 안 될수 ㄷ있음
		System.out.println("출력끝");
		sc.close();
	}

}
