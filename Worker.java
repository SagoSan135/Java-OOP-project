

public abstract class Worker implements Comparable <Worker>{

	protected String name;
	protected String lastName;
	protected boolean gender;
	protected Date birthDate;
	protected int seniority;
	
	
	public Worker(String name, String lastName, boolean gender, Date birthdate, int seniority) {
		
		this.name=name;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthdate;
		this.seniority = seniority;
		
	}

	
	public String toString() {
		return "Worker [name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", birthDate=" + birthDate
				+ ", seniority=" + seniority + "age= " + getAge();
	}
	
	public int getAge() {
		return 2022 - birthDate.getYear();
	}
	
	public void setSeniority(int seniority){
		this.seniority = seniority;
	}
	
	public int compareTo (Worker w) {
	
		if(this.seniority > w.seniority)
			return 1;
		if(this.seniority < w.seniority) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public abstract boolean isGreat();


		
}

