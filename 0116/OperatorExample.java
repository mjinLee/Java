public class OperatorExample{
	public static void main(String[] args){
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1)+"(DEC : "+v1+")");
		System.out.println(toBinaryString(v2)+"(DEC : "+v2+")");
		System.out.println(toBinaryString(v3)+"(DEC : "+v3+")");
		System.out.println();
	}
	public static String toBinaryString(int value){
		String str = Integer.toBinaryString(value);
		while(str.length()<32){
			str = "0"+str;
		}
		return str;
	}
}
