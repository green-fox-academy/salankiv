public class Student {

	public void learn() {
		System.out.println("Learned everything");
	}

	public void question(Teacher whom) {
		whom.answer();
	}

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();
		student.question(teacher);

	}
}
