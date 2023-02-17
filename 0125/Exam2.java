import java.util.Scanner;
public class Exam2{
	public static void main(String[] args){
		boolean run = true;
		int stdNum = 0;
		int[] score = null;
		Scanner scan = new Scanner(System.in);
		
		while(run){
			System.out.println("----------------------------------------------------");
			System.out.println("1. count | 2. input | 3. scorelist | 4. calc | 5. quit");
			System.out.println("----------------------------------------------------");
			System.out.print("select> ");
			int selectNo = scan.nextInt();
			if(selectNo == 1){
				System.out.print("student count> ");
				stdNum = scan.nextInt();
				score = new int[stdNum]; //
			} else if(selectNo == 2){
				for(int i =0; i<score.length;i++){
					System.out.print("score["+i+"]> ");
					score[i] = scan.nextInt();
				}
			}else if(selectNo == 3){
				for(int i =0; i<score.length;i++){
					System.out.println("score["+i+"]: "+score[i]);
				}
			}else if(selectNo == 4){
				int max =1, sum =0;
				for(int i=0; i<score.length;i++){
					if(score[i]>max){
						max = score[i];
					}
					sum += score[i];
				}
				System.out.println("max score: "+ max);
				double avg = (double)sum/stdNum;
				System.out.println("avg score: " + avg);
			}else if(selectNo == 5){
				run = false;
			}
		}
		System.out.println("program exit");
				
	}
}