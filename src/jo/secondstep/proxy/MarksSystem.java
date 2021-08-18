package jo.secondstep.proxy;

public class MarksSystem implements StudentManageSystem {

	@Override
	public void showMarks(String name, String role) {
		System.out.println("Marks of " + name);
		
	}

	@Override
	public void addMark(double mark, String name, String role) {
		System.out.println(mark + " added for" +  name);
		
	}



}
