public class ArrayCopyExam{
	public static void main(String[] args){
		String[] oldA = {"java","array","copy"};
		String[] newA= new String[5];
		System.arraycopy(oldA,0,newA,0,oldA.length);

		for(int i=0;i<newA.length;i++){
			System.out.print(newA[i]+", ");
		}
				
	}
}