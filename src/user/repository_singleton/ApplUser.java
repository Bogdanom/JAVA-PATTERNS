package user.repository_singleton;

public class ApplUser {

	public static void main(String[] args) {

		IUser user = UserRepository.getSingletonInstance().customer();
				
		System.out.println("user = " + user.getFirstName());
		System.out.print("user = " + user); //use of interface IUser not allow using setters
	}

}