public class RemoteControlExam {
	public static void main(String[] args){
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		//rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		//rc.turnOff();
		rc.setMute(true);
	}
}