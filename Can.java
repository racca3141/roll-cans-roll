import java.awt.event.*;
import java.util.concurrent.*;
import java.util.Random;

public class Can{

	private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

	private String canName;
	private boolean rolling;
	private Random gen;
	

	public Can(String name){
		canName = name;
		gen = new Random();

	}

	public String name(){
		return canName;
	}

	//setRoll
	public void setRoll(){
		rolling = true;
		int t = gen.nextInt(10);
		System.out.println("Starting " + canName + " for a " + t + " milliseconds roll.");
        	ScheduledFuture<?> countdown = scheduler.schedule(new Runnable() {
            		@Override
           		 public void run() {
                		System.out.println(canName + " stopped rolling ");
				rolling = false;
				scheduler.shutdown();
           		 }}, t, TimeUnit.MILLISECONDS);

		
	}

	//getRoll
	public boolean getRoll(){
		return rolling;
	}

	public static void main(String[] args){
		Can c = new Can("Emerson");
		c.setRoll();
	}
}