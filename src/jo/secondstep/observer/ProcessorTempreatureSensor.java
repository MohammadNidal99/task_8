package jo.secondstep.observer;

import java.util.ArrayList;
import java.util.List;

public class ProcessorTempreatureSensor {
	
	private List<ProcessorTempreatureSensorObserver> observers = new ArrayList<>();
	
	
	void register(ProcessorTempreatureSensorObserver processorTempreatureSensorObserver) {
		
		observers.add(processorTempreatureSensorObserver);
		
	}
	
	void unregister(ProcessorTempreatureSensorObserver processorTempreatureSensorObserver) {
		
		observers.remove(processorTempreatureSensorObserver);
		
	}
	
	void highTempreatureProcessor() {
		
		for(ProcessorTempreatureSensorObserver observer : observers) {
			observer.highTempreatre();
		}
		
	}


}
