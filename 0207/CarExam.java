public class CarExam {
	public static void main(String[] args){
		Car car = new Car();
		
		for(int i=1; i<=5; i++){
			int problemLocation = car.run();
			
			/*
			switch(problemLocation){
				case 1:
					System.out.println("front left to HankookTire");
					car.frontLeftTire = new HankookTire("front left", 15);
					break;
				case 2:
					System.out.println("front right to KumhoTire");
					car.frontRightTire = new KumhoTire("front right", 13);
					break;
				case 3:
					System.out.println("back left to HankookTire");
					car.backLeftTire = new HankookTire("back left", 14);
					break;
				case 4:
					System.out.println("front left to KumhoTire");
					car.backRightTire = new KumhoTire("back right", 17);
					break;
			}
			*/

			if(problemLocation != 0){
				System.out.println(car.tires[problemLocation-1].location+" to HankookTire");
				car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location,15);
			}
			System.out.println("-------------------------------------------");
		}
	}
} 