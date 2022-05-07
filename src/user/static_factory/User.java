package user.static_factory;

public class User {
	private String name;
	private String email;
	private int age;

	private User() {
		name = "";
		email = "";
		age = 0;
	}

	public static User getUserInstance() {
		return new User();
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
