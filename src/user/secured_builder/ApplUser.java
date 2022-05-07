package user.secured_builder;

public class ApplUser {

	public static void main(String[] args) {

		IUser user = User.getUserInstance()
				.setFirstName("leh")
				.setLastName("stor")
				.setLogin("lehstor")
				.setPassword("asd12")
				.setEmail("leh@gmail.com")// optional field could be skipped
				.build();
		System.out.println("user = " + user.getFirstName());
		System.out.println("user = " + user); //use of interface IUser not allow using setters
	}

}