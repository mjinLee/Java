public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll(){
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation){
			System.out.println(location + " KumhoTire age: " + (maxRotation - accmulatedRotation) + "cnt");
			return true;
		} else{
			System.out.println("*** " + location + " KumhoTire punk ***");
			return false;
		}
	}
}