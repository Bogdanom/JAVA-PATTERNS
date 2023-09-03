package user.static_factory;

public class ApplUser {

	public static void main(String[] args) {

		User user = User.getUserInstance()
				.setName("Leg1")
				.setEmail("leg1@gmail.com")
				.setAge(49);
		System.out.println("user = " + user.getName());
		System.out.println("user = " + user);	
	}

}