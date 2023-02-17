public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll(){
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation){
			System.out.println(location + " HankookTire age: " + (maxRotation - accmulatedRotation) + "cnt");
			return true;
		} else{
			System.out.println("*** " + location + " HankookTire punk ***");
			return false;
		}
	}
}