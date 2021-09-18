package och10;

public class MyException1 extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		String ErrMsg;
		ErrMsg = "사장님 100만원 보다 작아요 !! 이 뭡니까.";
		return ErrMsg;
	}

}
