package user.builder;

public class ApplUser {

	public static void main(String[] args) {

		User user = User.getUserInstance()
				.setFirstName("leh")
				.setLastName("stor")
				.setLogin("lehstor")
				.setPassword("asd12")
				.setEmail("leh@gmail.com")// optional field could be skipped
				.build();
		System.out.println("user = " + user.getFirstName());// warning - allow to use setters
		System.out.println("user = " + user);	            // look resolution in package secured builder
	}

}