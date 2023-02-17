public class AccountExam_19 {
	public static void main(String[] args){
		Account_19 account = new Account_19();
		
		account.setBalance(10000);
		System.out.println("total : "+account.getBalance());
		account.setBalance(-100);
		System.out.println("total : "+account.getBalance());
		account.setBalance(2000000);
		System.out.println("total : "+account.getBalance());
		account.setBalance(300000);
		System.out.println("total : "+account.getBalance());
	}
}