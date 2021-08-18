package jo.secondstep.observer;

public class ShutDown implements ProcessorTempreatureSensorObserver {

	@Override
	public void highTempreatre() {
		
		System.out.println("Shut Down the Computer");
		
	}

}
