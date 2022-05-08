package user.builder;

public class ApplUser {

	public static void main(String[] args) {

		User user = User.getUserInstance()
				.setFirstName("leh2")
			    .setLastName("stor2")
				.setLogin("lehstor2")
				.setPassword("asd122")
				.setEmail("leh2@gmail.com")// optional field could be skipped
				.build();
		System.out.println("user = " + user.getFirstName());// warning - allow to use setters
		System.out.print("user = " + user);	            // look resolution in package secured builder
	}

}