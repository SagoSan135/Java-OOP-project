
import java.util.InputMismatchException;
import java.util.Scanner;

public class WorkersMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Worker[] arr = new Worker[5];
		for(int i = 0; i<arr.length; i++) {
			String name, lastName, specialization;
			boolean gender = true;
			int day, mount, year, seniority, numOfSurgeries, vocationalTraining, positiveAssmnts;
			Date birthDate = new Date(day = 22, mount = 12, year = 1996);			
			
			System.out.println("Press: 1. for Doctor, 2. for Nurse");
			int oneOrTwo = s.nextInt();
			boolean loop;
			switch(oneOrTwo) {
			case 1: 
				s.nextLine();
				System.out.println("Enter the first name");
				name = s.nextLine();
				System.out.println("Enter the last name");
				lastName = s.nextLine();
				loop = true;
				while (loop) {
					try {
						System.out.println("Enter true for male and false for female");
						gender = s.nextBoolean();
						loop = false;
					} catch (InputMismatchException e) {
						System.out.printf("Exception: %s\n", e);
						s.nextInt();
					}
				}

				System.out.println("Enter date of birth day, mount and year.");
				day = s.nextInt();
				mount = s.nextInt();
				year = s.nextInt();
				System.out.println("Enter the seniority in years: ");
				seniority = s.nextInt();
				s.nextLine();
				System.out.println("Enter the specialization");
				specialization = s.nextLine();
				System.out.println("Enter the number of surgeries");
				numOfSurgeries = s.nextInt();
				Date date = new Date(22,12,1996);
			
				arr[i] = new Doctor(name, lastName, gender, date, seniority, specialization, numOfSurgeries);
				break;

			case 2:
				s.nextLine();
				System.out.println("Enter the first name");
				name = s.nextLine();
				System.out.println("Enter the last name");
				lastName = s.nextLine();
				loop = true;
				while (loop) {
					try {
						System.out.println("Enter true for male and false for female");
						gender = s.nextBoolean();
						loop = false;
					} catch (InputMismatchException e) {
						System.out.printf("Exception: %s\n", e);
						s.nextInt();
					}
				}
				System.out.println("Enter date of birth day, mount and year.");
				day = s.nextInt();
				mount = s.nextInt();
				year = s.nextInt();
				System.out.println("Enter the seniority");
				seniority = s.nextInt();
				System.out.println("Enter the number of professional trainings");
				vocationalTraining = s.nextInt();
				System.out.println("Enter the number of Positive evaluations");
				positiveAssmnts = s.nextInt();
				Date date2 = new Date(22,11,1996);

				arr[i] = new Nurse(name, lastName, gender, date2, seniority, vocationalTraining, positiveAssmnts); 
			default:
				System.err.println("Input out of range");
			}
		}

	}

}






