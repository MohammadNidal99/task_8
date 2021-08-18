package jo.secondstep.observer;

public class Main {
	
	public static void main(String[] args) {
		
		ProcessorTempreatureSensor processorTempreatureSensor = new ProcessorTempreatureSensor();
		
		ProcessorFan fan = new ProcessorFan();
		Notification notification = new Notification();
		ShutDown sutDown = new ShutDown();
		
		processorTempreatureSensor.register(notification);
		processorTempreatureSensor.register(fan);
		processorTempreatureSensor.register(sutDown);
		
		processorTempreatureSensor.highTempreatureProcessor();
		
	}

}
