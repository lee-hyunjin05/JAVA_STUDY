package och10;

public class MyException2 extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		String ErrMsg;
		ErrMsg = "사장님 1000만원 너무 많아요, 좀 적당히 합시다.";
		return ErrMsg;
	
	}
	
}
