
class InsufficientException extends Exception{
	public InsufficientException() {
		
	}
	public InsufficientException(String message) {
		super(message);
	}
}

public class NoExcepthon {

	public static void main(String[] args) {
		Acount myAcount = new Acount();
		myAcount.deposit(10000);
		System.out.println("예금액 : " + myAcount.getBalance());
		try {
			myAcount.withdraw(11000);
		} catch (InsufficientException e){
			System.out.println(e.getMessage());
		}
		System.out.println("예금액 : " + myAcount.getBalance());
		
	}
}



class Acount{
	private long balance; // 잔액 
	
	public Acount() {}
	public long getBalance() { // 잔액조회 
		return balance;
	}
	public void deposit(int money) { // 입금
		balance += money;
	}
	public void withdraw(int money) throws InsufficientException { // 출금
		
		// 일반적으로 if문으로 예외처리를 한다
		if(balance < money) {
			//System.out.println("잔고부족 : " + (money - balance) + "모자랍니다");
			throw new InsufficientException("잔고부족 : " + (money - balance) + "모자랍니다");
		} 
//		else {
//			balance -= money;
//		}
	}
}