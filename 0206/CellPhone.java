public class CellPhone {
	String model;
	String color;
	
	void powerOn() { System.out.println("power on"); }	
	void powerOff() { System.out.println("power off"); }
	void bell() { System.out.println("bell"); }	
	void sendVoice(String message) { System.out.println("A: " + message); }	
	void receiveVoice(String message) { System.out.println("B: " + message); }	
	void hangUp() { System.out.println("hang up"); }
}

