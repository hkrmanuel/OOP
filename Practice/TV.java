/*
 * TV.java
 *
 * @author Emmanuel Adotey Acquaye (10112026)
 * @author Papa Yaw Badu (95882026)
 *
 * This class represents a TV with methods to control its channel, volume, and power.
 *
 * The TV class has the following fields:
 * - scanChannel: Represents the number of channels the TV can scan.
 * - turnOn: Indicates whether the TV is turned on.
 * - turnOff: Indicates whether the TV is turned off.
 * - Channel: Represents the current channel the TV is tuned to.
 * - Volume: Represents the current volume level of the TV.
 *
 * The TV class has the following methods:
 * - satellite(): Simulates scanning for channels and stores the number of channels in scanChannel.
 * - setChannel(int channum): Sets the current channel to channum if it is less than or equal to scanChannel.
 * - Channelup(int i): Increases the current channel by i.
 * - Channeldown(int i): Decreases the current channel by i.
 * - Volumeup(int i): Increases the current volume by i.
 * - VolumeDown(int i): Decreases the current volume by i.
 * - getChannelNumber(): Returns the current channel number.
 * - getVolumeNumber(): Returns the current volume level.
 *
 * The TestTV class is used to test the functionality of the TV class.
 *
 * The main method in the TestTV class creates a new TV object and performs the following operations:
 * - Calls the satellite() method to simulate scanning for channels.
 * - Calls the setChannel(70) method to set the current channel to 70.
 * - Calls the Channelup(5) method to increase the current channel by 5.
 * - Calls the Volumeup(5) method to increase the current volume by 5.
 * - Prints the current channel number and volume level.
 */

public class TV {
	static int scanChannel;
	public boolean turnOn;
	public boolean turnOff;
	private int Channel;
	private int Volume;


TV(){
	
}

public void satellite(){
	scanChannel = 50 + (int) (Math.random() * 50);
    System.out.println( scanChannel + " channels " + "Gotten");
	
}

public void setChannel(int channum){
	if (channum <= scanChannel){
		Channel = channum;	
	}
	else{
		System.out.println("Invalid Channel Number");
}
	
}
public void Channelup(int i){
	for (int s = i; s>0; s--){
		Channel ++;
	}

	
}
public void Channeldown(int i){
	for (int s = i; s>0; s--){
		Channel --;
	}
}

public void Volumeup(int i){
	for (int s = i; s>0; s--){
		Volume ++;
	}
	
}
public void VolumeDown(int i){
	for (int s = i; s>0; s--){
		Volume --;
	}
}
public int getChannelNumber(){
	return Channel;
}
public int getVolumeNumber(){
	return Volume;
}

}

class TestTV{
	public static void main(String[] args){
	TV tv = new TV();
	tv.satellite();
    tv.setChannel(20);
	tv.Channelup(5);
	tv.Volumeup(5);
	System.out.println(tv.getChannelNumber());
	System.out.println(tv.getVolumeNumber());
	
}
}