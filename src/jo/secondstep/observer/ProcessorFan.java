package jo.secondstep.observer;

public class ProcessorFan implements ProcessorTempreatureSensorObserver {

	@Override
	public void highTempreatre() {
		
		System.out.println("Increase Processor Fan Speed");
		
	}

}
