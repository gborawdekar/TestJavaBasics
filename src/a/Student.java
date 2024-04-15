package a;

public class Student extends Person {

	private String education;

	public Student(int id, String name, int age, String city, String education) {
		super(id, name, age, city);
		this.education = education;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}
}
