public class Sensor{
	
	private boolean detect;

	public Sensor(){
		detect = false;
	}

	public boolean isOn(){
		return detect;	
	}
	
	public void setOff(){
		System.out.println("The sensor detects nothing.");
		detect = false;
	}

	public void setOn(){
		System.out.println("The sensor detects something.");
		detect = true;
	}
}