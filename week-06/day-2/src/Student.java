public class Student implements Cloneable{
	String previousOrganization;
	int skippedDays;
	String name;
	int age;
	String gender;

	public void getGoal() {
		System.out.println("Be a junior software developer.");
	}

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

	public Student() {
		this.previousOrganization = "The School of Life";
		this.skippedDays = 0;
	}

	public Student clone() {
		return new Student(this.name, this.age, this.gender, this.previousOrganization);
	}

	public static void main(String[] args) {
		Student john = new Student("John Doe", 20, "male", "BME");
		Student johnTheClone = john.clone();

		System.out.println(john.name);
		System.out.println(johnTheClone.name);
	}
}
