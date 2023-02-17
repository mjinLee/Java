public class MemberService_15 {
	String id;
	String password;

	MemberService_15() { }
	boolean login(String id, String password){
		if(id=="hong" && password=="12345")
			return true;
		else 	
			return false;
	}
	void logout(String id) {
		System.out.println("logout!!");
	}	
}