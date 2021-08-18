package jo.secondstep.proxy;

public class MarkSystemProxy implements StudentManageSystem {
	
//	private MarksSystem marksSystem = new MarksSystem();
	private StudentManageSystem studentManageSystem;
	
	public MarkSystemProxy(StudentManageSystem studentManageSystem) {
		
		this.studentManageSystem = studentManageSystem;
		
	}

	@Override
	public void showMarks(String name, String role) {
		
		studentManageSystem.showMarks(name, role);
	}

	@Override
	public void addMark(double mark, String name, String role) {
		
		if(role == "student") {
			System.out.println("Student can't add marks");
			return;
		}
		studentManageSystem.addMark(mark, name, role);
		
	}

}
