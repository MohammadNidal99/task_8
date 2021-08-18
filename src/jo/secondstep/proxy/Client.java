package jo.secondstep.proxy;

public class Client {

	public static void main(String[] args) {
		
		StudentManageSystem studentManageSystem = new MarkSystemProxy(new MarksSystem());
		
		studentManageSystem.addMark(50, "Mohammad", "student");

	}

}
