package user.secured_builder;

public class ApplUser {

	public static void main(String[] args) {

		IUser user = User.getUserInstance()
				.setFirstName("leh3")
				.setLastName("stor3")
				.setLogin("lehstor3")
				.setPassword("asd123")
				.setEmail("leh3@gmail.com")// optional field could be skipped
				.build();
		System.out.println("user = " + user.getFirstName());
		System.out.print("user = " + user); //use of interface IUser not allow using setters
	}

}