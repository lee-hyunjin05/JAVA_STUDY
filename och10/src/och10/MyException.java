package och10;

public class MyException extends Exception{//얘를 상속 받았기에 에러객체ㅔ가 되는
	//나만의 예외 클래스 한번 만들어 본거
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		
		String errMsg;
		errMsg = "아니, 10보다 크다니...";
		return errMsg;
	} 

	
	
	
	
	
}
