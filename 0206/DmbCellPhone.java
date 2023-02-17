public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("channel " + channel + "start");
	}	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel " + channel + "change");
	}
	void turnOffDmb() {
		System.out.println("DMB turn off");
	}	
}

