package user.classic;

public class ApplUser {

	public static void main(String[] args) {

		User user = new User()
				.setName("oleh")
				.setEmail("oleh@gmail.com")
				.setAge(47);
		System.out.println("user = " + user.getName());
		System.out.println("user = "+user);	
	}

}
