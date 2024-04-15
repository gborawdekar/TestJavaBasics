package a;

public class Person {//implements Comparable<Person> {

	private int id;
	private String name;
	private int Salary;
	private String city;

	public Person() {
	}

	public Person(int id, String name, int Salary) {
		super();
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}

	public Person(int id, String name, int Salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.Salary = Salary;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Salary=" + Salary + ", city=" + city + "]";
	}
/*
	@Override
	public int compareTo(Person o) {
		if (this.getSalary() > o.getSalary()) {
			return 1;
		} else if (this.getSalary() < o.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}*/
}
