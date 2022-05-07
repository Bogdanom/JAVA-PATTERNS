package user.repository_file;

public class ApplUser {

	public static void main(String[] args) {

		IUser user = UserRepository.getSingletonInstance().customer();
				
		System.out.println("user = " + user.getFirstName());
		System.out.println("user = " + user); //use of interface IUser not allow using setters
	}

}