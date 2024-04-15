package a;

public class User implements Cloneable {

	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
