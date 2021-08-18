package jo.secondstep.singleton;

public class Application {

	public static void main(String[] args) {
		
		AIModel model = AIModel.getInstance();
		
		System.out.println(model);

	}

}
