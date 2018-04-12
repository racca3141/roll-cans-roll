public class MainClass{
	public static void main(String[] args){
		int numCans = 5;
		String name;

		Can[] canID = new Can[numCans];

		Sensor s1 = new Sensor();
		Solenoid n1 = new Solenoid("N1");


		int cnt = 0;

		//create the cans
		for(int c = 0; c < numCans; c++){
			name = "Can" + c;
			canID[c] = new Can(name);
			System.out.println(canID[c].name());
		} 

		s1.setOn();
		System.out.println("Can set.  Turn the system on.");

		while(true){
			//check s1 (sensor)
			if(cnt < numCans)
				s1.setOn();
			else{
				if(!s1.isOn())
					System.out.println("Sensor doesn't detect anything.");
				else
					s1.setOff();
			}

			//check n1 (solenoid)
			if(s1.isOn()){
				//retract the solenoid to open the gate
				n1.setRetract();
			}

			//roll can
			if(!n1.isExtended() && cnt < 5)
				canID[cnt].setRoll();

			//extend solenoid to close the gate
			if(!n1.isExtended())
				n1.setExtend();
			

			cnt++;
			if(cnt > 1000)
				break;
		}

	}
}