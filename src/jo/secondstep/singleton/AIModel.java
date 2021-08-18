package jo.secondstep.singleton;

public class AIModel {
	
	private String modelDirectory;
	private String modelName;
	private static AIModel instance;
	
	

	public String getModelDirectory() {
		return modelDirectory;
	}

	public void setModelDirectory(String modelDirectory) {
		this.modelDirectory = modelDirectory;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	private AIModel() {
		this.setModelDirectory("D:");
		this.setModelName("Car Detection Model");
		
	}
	
	public static AIModel getInstance() {
		
		if (instance == null) {
			synchronized (AIModel.class) {
				if(instance == null) {
					instance = new AIModel();
				}
				
			}
		}
		
		return instance;
	}

	@Override
	public String toString() {
		return "AIModel [modelDirectory= " + modelDirectory + " , modelName= " + modelName + "]";
	}


	

}
