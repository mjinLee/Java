public interface RemoteControl{
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	public void turnOn();
	public void turnOff();
	
	default void setMute(boolean mute){
		if(mute){ // true
			System.out.println("mute == true");
		} else{
			System.out.println("mute == false");
		}
	}
}