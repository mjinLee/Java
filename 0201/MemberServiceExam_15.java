public class MemberServiceExam_15 {
	public static void main(String[] args){
		MemberService_15 memberService = new MemberService_15();
		boolean result = memberService.login("hong","12345");
		if(result){
			System.out.println("login!!!");
			memberService.logout("hong");
		} else{
			System.out.println("id or password is incorrect");
		}
	}
}