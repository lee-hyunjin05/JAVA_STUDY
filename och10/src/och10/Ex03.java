package och10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {

		FileReader reader;
		char[] buffer = new char[100];
		//String file_name = ".classpath";//오류없는
		String file_name = ".kkk"; //오류
		try {
			reader = new FileReader(file_name);
			reader.read(buffer,0,100); //0부터 100바이트 읽어서 buffer에 집어넣음
			String str = new String(buffer);
			System.out.println("읽은건 "+str);
			reader.close();
		}
		catch(FileNotFoundException e) {	//		(지정된 파일을 찾을 수 없습니다) getmessage에 지정된 말
			System.out.println("그런 파일 없습니다."+ e.getMessage());
		}
		catch(IOException e) {
			System.out.println("읽다가 에러남");
		}
		finally {
			System.out.println("어찌됐건 읽었음");
		}
		
		
	}

}
