public class arrayExam{
	public static void main(String[] args) {	
		int[] sc;
		sc = new int[]{83,90,87};
		int sum1 = 0;
		for(int i=0; i<3;i++){
			sum1 += sc[i];
		}
		System.out.println("sum : " +sum1);
		
		int sum2 = add( new int[]{83,90,87} );
		System.out.println("sum : "+sum2);
		System.out.println();
	}
	public static int add(int[] sc){
		int sum =0;
		for(int i=0;i<3; i++){
			sum += sc[i];
		}
		return sum;
	}
}