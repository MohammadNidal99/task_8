package jo.secondstep.observer.wrong;

import java.util.ArrayList;
import java.util.List;


public class FireSensor {
	
	List<String> observers = new ArrayList<>();
	
	void register(String observer) {
		observers.add(observer);
	}
	
	void unregister(String observer) {
		observers.remove(observer);
	}
	
	void detectFire() {
		
		for(String observer : observers) {
			if(observer == "FireDepartment") {
				System.out.println("Calling 911");
			}
			else if(observer == "SMSNotification") {
				System.out.println("Send SMS");
			}
/*			else if(observer == "WaterSprinkler") {
				System.out.println("Turning the WaterSprinkler on");
			}
*/		}
		
	}
	

}
