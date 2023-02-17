public class Supersonic extends Air {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;
	
	@Override
	public void fly(){
		if(flyMode == SUPERSONIC){
			System.out.println("supersonic!!");
		} else{
			super.fly();
		}
	}
}

