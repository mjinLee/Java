public class VehicleExam {
	public static void main(String[] args){
		Vehicle vh = new Bus();
		
		vh.run();
		//vh.checkFare(); // (x)
		
		Bus b = (Bus) vh;
		
		b.run();
		b.checkFare();
	}
}