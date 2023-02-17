public class ComExam {
	public static void main(String[] args) {
		int r =10;
		
		Calc cal = new Calc();
		System.out.println("areaCircle: "+cal.areaCircle(r));
		System.out.println();
		Com com = new Com();
		System.out.println("areaCircle: " + com.areaCircle(r));
	}
}
