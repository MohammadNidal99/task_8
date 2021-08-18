package jo.secondstep.observer.wrong;


public class Main {

	public static void main(String[] args) {
		
		FireSensor fireSensor = new FireSensor();
		
		fireSensor.register("FireDepartment");
		fireSensor.register("SMSNotification");
//		fireSensor.register("WaterSprinkler");
		
		fireSensor.detectFire();
			
		

	}

}
