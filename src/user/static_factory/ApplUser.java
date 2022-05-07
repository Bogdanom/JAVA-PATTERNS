package user.static_factory;

public class ApplUser {

	public static void main(String[] args) {

		User user = User.getUserInstance()
				.setName("oleh")
				.setEmail("oleh@gmail.com")
				.setAge(47);
		System.out.println("user = " + user.getName());
		System.out.println("user = " + user);	
	}

}