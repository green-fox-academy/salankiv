public class Teacher {


	public void teach(Student what) {
		what.learn();
	}

	public void answer() {
		System.out.println("I don't know...");
	}

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Student student = new Student();
		teacher.teach(student);
	}
}
