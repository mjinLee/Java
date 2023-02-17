class Tele{
	static String company ="samsung";
	static String model = "LCD";
	static String info;
	
	static{
		info = company + "-"+model;
	}
}

public class TeleExam {
	public static void main(String[] args) {
		System.out.println(Tele.info);
	}
}