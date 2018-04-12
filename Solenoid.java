import java.util.concurrent.*;
import java.util.Random;

public class Solenoid{

	private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	private String solenoidName;
	private boolean extended;
	private Random gen;
	

	public Solenoid(String name){
		solenoidName = name;
		gen = new Random();
		extended = true;
	}

	//
	public void setExtend(){
		System.out.println("Solenoid is now extended.");
		extended = true;
	}

	public void setRetract(){
		System.out.println("Solenoid is now retracted.");
		extended = false;
	}

	public boolean isExtended(){
		return extended;
	}

}