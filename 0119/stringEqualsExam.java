public class stringEqualsExam{
	public static void main(String[] args) {	
		String str1 = "aaa";
		String str2 = "aaa";
		if(str1 == str2){
			System.out.println("ref equal");//
		} else{
			System.out.println("ref not equal");
		}
		if(str1.equals(str2)){
			System.out.println("string equal");//
		} 

		String str3 = new String("aaa");
		String str4 = new String("aaa");
		if(str3 == str4){
			System.out.println("ref equal");
		} else{
			System.out.println("ref not equal");//
		}
		if(str3.equals(str4)){
			System.out.println("string equal");//
		} 
	}
}