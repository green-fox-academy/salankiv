public class Student extends Person {
	String previousOrganization;
	int skippedDays;

	@Override
	public void getGoal() {
		System.out.println("Be a junior software developer.");
	}

	@Override
	public void introduce() {
		System.out.println("Hi, I'm " + name + ", a " + age +" year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
	}

	public void skipDays(int numberOfDays) {
		this.skippedDays += numberOfDays;
	}

	public Student(String name, int age, String gender, String previousOrganization) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.previousOrganization = previousOrganization;
		this.skippedDays = 0;
	}

	private Student() {
		this.previousOrganization = "The School of Life";
		this.skippedDays = 0;
	}

}
