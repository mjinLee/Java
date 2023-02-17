public class Car{
	/*
	Tire frontLeftTire = new Tire("front left",6);
	Tire frontRightTire = new Tire("front right",2);
	Tire backLeftTire = new Tire("back left",3);
	Tire backRightTire = new Tire("back right",4);
	*/

	Tire[] tires = {
		new Tire("front left",6), new Tire("front right", 2), 
		new Tire("back left",3), new Tire("back right",4)
	};
	
	int run(){
		System.out.println("[car is running]");

		/*
		if(frontLeftTire.roll()==false) { stop(); return 1; }
		if(frontRightTire.roll()==false) { stop(); return 2; }
		if(backLeftTire.roll()==false) { stop(); return 3; }
		if(backRightTire.roll()==false) { stop(); return 4; }
		*/

		for(int i=0;i<tires.length; i++){
			if(tires[i].roll()==false){
				stop();
				return (i+1);
			}
		}
		return 0;
	}

	void stop(){
		System.out.println("[car is stop]");
	}
}