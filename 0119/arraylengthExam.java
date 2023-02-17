public class arraylengthExam{
	public static void main(String[] args) {	
		int[] s = {8,9,0};
		int sum = 0;
		for(int i=0;i<s.length;i++){
			sum += s[i];
		}
		System.out.println("sum: "+sum);
		double avg = (double)sum/s.length;
		System.out.println("avg: " +avg);
	}
}