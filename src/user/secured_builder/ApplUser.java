package user.secured_builder;

public class ApplUser {

	public static void main(String[] args) {

		IUser user = User.getUserInstance()
				.setFirstName("leg3")
				.setLastName("stor3")
				.setLogin("legstor3")
				.setPassword("asd123")
				.setEmail("leg3@gmail.com")// optional field could be skipped
				.build();
		System.out.println("user = " + user.getFirstName());
		System.out.print("user = " + user); //use of interface IUser not allow using setters
	}

}