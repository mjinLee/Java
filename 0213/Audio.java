public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;

	public void turnOn(){
		System.out.println("Audio turn on");
	}
	public void turnOff(){
		System.out.println("Audio turn off");
	}

	@Override
	public void setMute(boolean mute){
		this.mute = mute;
		if(mute){
			System.out.println("Audio mute == true");
		}else{
			System.out.println("Audio mute == false");
		}
	}
}