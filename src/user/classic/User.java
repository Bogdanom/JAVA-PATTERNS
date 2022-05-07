package user.classic;
public class User {
	private String name;
	private String email;
	private int age;

	public User() {
		name = "";
		email = "";
		age = 0;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public User setAge(int age) {
		this.age = age;
		return this;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}
