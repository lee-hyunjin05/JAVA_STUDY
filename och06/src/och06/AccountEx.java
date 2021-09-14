package och06;

class Account{ 
	String accountNo;	//계좌번호
	String ownername;	//계좌 주
	int balance;		//잔액
	
	//저축
	void deposit(){
		balance += 1000;
	}
	
	//인출 
	void withdraw() {
		balance -= 500;
	}
	
	//잔액 전달 
	int getBal() {
		return balance;
	}
}

public class AccountEx {
	
	public static void main(String[] args) {
		
		Account ac1 = new Account();
		ac1.accountNo = "국민-222-222";
		ac1.ownername = "이현진";
		ac1.balance = 5000;
		
		for(int i=0; i<3; i++) {
			ac1.deposit();	//저축
		}
		System.out.println("이현진 잔액 : "+ac1.getBal());
		
		for(int i=0; i<3; i++) {
			ac1.withdraw();	//인출
		}
		System.out.println("성명 : "+ac1.ownername + "\t계좌 : "+ac1.accountNo+"\t잔액 : "+ac1.getBal());
		
		
		Account ac2 = new Account();
		ac2.accountNo = "신한-111-222";
		ac2.ownername = "이현호";
		ac2.balance = 10000;
		
		for(int i=0; i<3; i++) {
			ac2.deposit();	//저축
		}
		System.out.println("이현호 잔액 : "+ac2.getBal());
		
		for(int i=0; i<3; i++) {
			ac2.withdraw();	//인출
		}
		System.out.println("성명 : "+ac2.ownername + "\t계좌 : "+ac2.accountNo+"\t잔액 : "+ac2.getBal());
	}

}
