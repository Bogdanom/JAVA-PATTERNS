package user.classic;

public class ApplUser {

	public static void main(String[] args) {

		User user = new User()
				.setName("Leg")
				.setEmail("leg@gmail.com")
				.setAge(49);
		System.out.println("user = " + user.getName());
		System.out.println("user = "+ user);	
	}

}
