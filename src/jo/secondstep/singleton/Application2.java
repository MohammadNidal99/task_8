package jo.secondstep.singleton;

public class Application2 {
	
public static void main(String[] args) {
	AIModel model = AIModel.getInstance();
	model.setModelDirectory("C");
	model.setModelName("Face Recognition Model");
	System.out.println(model);
}

}
