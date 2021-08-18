package jo.secondstep.observer;

public class Notification implements ProcessorTempreatureSensorObserver {

	@Override
	public void highTempreatre() {
		
		System.out.println("Warning: the processor tempreature is very high");
		
	}

}
