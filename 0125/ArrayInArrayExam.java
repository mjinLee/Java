public class ArrayInArrayExam{
	public static void main(String[] args){
		int[][] math = new int[2][3];
		for(int i=0;i<math.length;i++){
			for(int k=0;k<math[i].length;k++){
				System.out.println("math["+i+"]["+k+"] = "+math[i][k]);
			}
		}
		System.out.println();

		int[][] eng= new int[2][];
		eng[0] = new int[2];
		eng[1] = new int[3];
		for(int i=0;i<eng.length;i++){
			for(int k=0;k<eng[i].length;k++){
				System.out.println("eng["+i+"]["+k+"] = "+eng[i][k]);
			}
		}
		System.out.println();

		int[][] java = { {95,80}, {92,96,80} };
		for(int i=0;i<java.length;i++){
			for(int k=0;k<java[i].length;k++){
				System.out.println("java["+i+"]["+k+"] = "+java[i][k]);
			}
		}
	}
}