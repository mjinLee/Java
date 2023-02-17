import java.util.Scanner;
public class BookApplication_20 {
	private static Account_20[] accountArray = new Account_20[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		boolean run = true;
		while(run){
			System.out.println("----------------------------------------------------");
			System.out.println("1. create | 2. list | 3. input | 4. output | 5. quit");
			System.out.println("----------------------------------------------------");
			System.out.print("select> ");
			
			int selectNo = scan.nextInt();
			if(selectNo == 1){
				createAccount();
			} else if(selectNo == 2){
				accountList();
			} else if(selectNo == 3){
				deposit();
			} else if(selectNo == 4){
				withdraw();
			} else if(selectNo == 5){
				run = false;
			} else {
				System.out.println("**input number ( 1 ~ 5 )");
			}
		}
		System.out.println("**program terminated");
	}
	
	// 1. create
	private static void createAccount(){
		System.out.println("---------------");
		System.out.println("Account Create");
		System.out.println("---------------");
		System.out.print("account_no : "); // number
		String ano = scan.next(); //scan.nextLine() -> X 
		System.out.print("account_name : "); // name
		String owner = scan.next();
		System.out.print("balance : "); // init balance
		int balance = scan.nextInt();		
		Account_20 newAcc = new Account_20(ano, owner, balance);
		for(int i = 0; i<accountArray.length;i++){
				if(accountArray[i] == null) {
					accountArray[i] = newAcc;
					break;
				}
		}
		System.out.println("**account create success!!");
		
	}
	// 2. list
	private static void accountList(){
		System.out.println("--------------");
		System.out.println("Account List");
		System.out.println("---------------");
		for(int i = 0; i<accountArray.length;i++){
			Account_20 acc = accountArray[i];
			if(acc != null){
				System.out.print(acc.getAno() + "   "+acc.getOwner()+"   "+acc.getBalance());
				System.out.println();
			}
		}
	}
	// 3. input
	private static void deposit(){
		System.out.println("-----------------");
		System.out.println("Input");
		System.out.println("-----------------");	
		System.out.print("account_no : ");
		String ano = scan.next();
		Account_20 acc = findAccount(ano); // account search
		if(acc == null){
			System.out.println("**account isn't exist.");
			return;
		} else {
			System.out.print("input : ");
			int input = scan.nextInt();
			acc.setBalance(acc.getBalance()+input);
			System.out.println("**input success!!");	
		}	
	}
	// 4. output
	private static void withdraw(){
		System.out.println("-----------------");
		System.out.println("Output");
		System.out.println("-----------------");	
		System.out.print("account_no : ");
		String ano = scan.next();	
		Account_20 acc = findAccount(ano);
		if(acc == null){
			System.out.println("**account isn't exist.");
			return;
		} else {
			System.out.print("output : ");
			int output = scan.nextInt();
			acc.setBalance(acc.getBalance()-output);
			System.out.println("**output success!!");
		}
	}
	// Account_20[] -> ano == Account_20's
	private static Account_20 findAccount(String ano){
		Account_20 acc = null;
		String anoData;
		for(int i=0;i<accountArray.length;i++){
			anoData = accountArray[i].getAno(); // ano
			if(anoData.equals(ano)){
				acc = accountArray[i];
				break;
			}			
		}
		return acc;
	}
}