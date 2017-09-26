package GreenFoxOrganization;

public class Sponsor extends Person {
	String company;
	int hiredStudents;

	@Override
	public void introduce() {
		System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
	}

	@Override
	public void getGoal() {
		System.out.println("Hire brilliant junior software developers.");
	}

	public void hire() {
		hiredStudents += 1;
	}

	public Sponsor(String name, int age, String gender, String company) {
		super(name, age, gender);
		this.company = company;
		this.hiredStudents = 0;
	}

	public Sponsor() {
		this.company = "Google";
		this.hiredStudents = 0;
	}
}
