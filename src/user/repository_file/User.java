package user.repository_file;

import java.util.ArrayList;
import java.util.List;

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
	IUser build();
}

public class User implements IFirstName, ILastName, ILogin, 
							 IPassword, IBuildUser, IUser {
	
	private final static String EMAIL_SEPARATOR ="@";
	private final static String EMPTY_STRING =new String();
	
	private String firstName;
	private String lastName;
	private String login;
	private String password;
	private String email;


	private User() {
//		firstName = "";//lastName = "";//login = "";//password = "";
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
	
	public IUser build() {
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
		return "\nUser [firstName=" + firstName + ", lastName=" + lastName + ", login=" + login + ", password=" + password
				+ ", email=" + email + "]";
	}

	// add equals, hashCode, compareTo, toString
	
	public static IUser createUser(List<String> row) {
		List<String> userData = new ArrayList<>(row);
		for(int i=userData.size();i<UserColumns.values().length;i++) {
			userData.add(EMPTY_STRING);
	}
		return User.getUserInstance().setFirstName(userData.get(UserColumns.FIRST_NAME.getIndex()))
									.setLastName(userData.get(UserColumns.LAST_NAME.getIndex()))
									.setLogin(userData.get(UserColumns.LOGIN.getIndex()))
									.setPassword(userData.get(UserColumns.PASSWORD.getIndex()))
									.setEmail(userData.get(UserColumns.EMAIL.getIndex()))
									.build();
									
	}
	
	public static List<IUser> createUsers(List<List<String>> rows) {
		List<IUser> result = new ArrayList<>();
		String email = rows.get(0).get(UserColumns.EMAIL.getIndex());
		if((email != null) && (!email.contains(EMAIL_SEPARATOR))) {
			rows.remove(0);
		}
			
		for(List<String> row: rows) {
			result.add(createUser(row));
		}
		return result;
	}
}
enum UserColumns {
	FIRST_NAME(0),
	LAST_NAME(1),
	LOGIN(2),
	PASSWORD(3),
	EMAIL(4);
	
	private int index;
	
	private UserColumns(int index) {
		this.index=index;
	}	
	public int getIndex() {
		return index;
	}
}