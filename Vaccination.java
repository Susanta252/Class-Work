abstract class Vaccine {
	
	public abstract void boosterDose();
	
	public void firstDose(){
		int age = 17;
		String nationality = "Indian";
		if(age >= 18 && nationality.equals("Indian")){
			System.out.println("First Dose of Vaccine is given");
			System.out.println("User has to pay 250Rs for First Dose");
		}
		else {
			System.out.println("First Dose cannot be given as age is not 18 or user is not Indian");
		}
	}
	
	public void secondDose(){
		System.out.println("Second Dose can be given if First Dose is completed");
	}
}

class VaccinationSuccessful extends Vaccine {

	public void boosterDose(){
		System.out.println("Booster Dose can be taken if the Vaccination is successful");
	}
}

public class Vaccination {
	
	public static void main(String[] args) {
		VaccinationSuccessful v = new VaccinationSuccessful();
		v.firstDose();
		v.secondDose();
		v.boosterDose();
	}
}