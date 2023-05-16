
public class Nurse extends Worker {

	protected int vocationalTraining;
	protected int positiveAssmnts;
	
	public Nurse(String name, String lastName, boolean gender, Date birthdate, int seniority,int vocationalTraining, int positiveAssmnts)
	{
		
		super(name, lastName, gender, birthdate, seniority);
		this.vocationalTraining = vocationalTraining;
		this.positiveAssmnts = positiveAssmnts;
		
	}

	
	public String toString() {
		return super.toString() + "Vocational Trainings: " + vocationalTraining + "/n" + "Positives Assessments: " + positiveAssmnts; 
	}
	
	public void setVocationalTraining(int vocationalTraining) {
		 this.vocationalTraining = vocationalTraining;
	}
	
	public void setPositiveAssmnts() {
		this.positiveAssmnts++;
	}


	public boolean isGreat() {
		boolean flag = false;
		if(this.vocationalTraining >5 && positiveAssmnts>=seniority*2) {
			flag = true;
		}
		return flag;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
