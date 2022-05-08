package user.static_factory;

public class ApplUser {

	public static void main(String[] args) {

		User user = User.getUserInstance()
				.setName("oleh1")
				.setEmail("oleh1@gmail.com")
				.setAge(27);
		System.out.println("user = " + user.getName());
		System.out.println("user = " + user);	
	}

}