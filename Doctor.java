
public class Doctor extends Worker {

	private String specialization;
	private int numOfSurgeries;
	
	public Doctor(String name, String lastName, boolean gender, Date birthdate, int seniority,String specialization, int numOfSurgeries) {
		
		super(name, lastName, gender, birthdate, seniority);
		this.specialization = specialization;
		this.numOfSurgeries = numOfSurgeries;
	}
	
	public void setNumOfSurgeries(int numOfSurgeries) {
		this.numOfSurgeries = numOfSurgeries;
	}
	
	public boolean isGreat() {
		if(this.numOfSurgeries >= 3*seniority) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "Doctor [specialization=" + specialization + ", numOfSurgeries=" + numOfSurgeries + ", name=" + name
				+ ", lastName=" + lastName + ", gender=" + gender + ", birthDate=" + birthDate + ", seniority="
				+ seniority + "]"; 
		}

	
}
	
	

