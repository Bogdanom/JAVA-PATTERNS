package user.builder; //pattern Builder let you not skipping any field for some user

interface IFirstName {
	ILastName setFirstName(String firstName);
}

interface ILastName {
	ILogin setLastName(String lastName);
}

interface ILogin {
	IPassword setLogin(String login);
}

interface IPassword {
	IBuildUser setPassword(String password);
}

interface IBuildUser {
	IBuildUser setEmail(String email);
	User build();
}

public class User implements IFirstName, ILastName, ILogin, 
							 IPassword, IBuildUser {
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private String email;


	private User() {
//		firstName = "";
//		lastName = "";
//		login = "";
//		password = "";
		email = "";//pattern Builder - in constructor stays optional fields only 
	}

	public static IFirstName getUserInstance() {
		return new User();
	}

	public ILastName setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ILogin setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public IPassword setLogin(String login) {
		this.login = login;
		return this;
	}

	public IBuildUser setPassword(String password) {
		this.password = password;
		return this;
	}

	public IBuildUser setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public User build() {
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", login=" + login + ", password=" + password
				+ ", email=" + email + "]";
	}

	
}
