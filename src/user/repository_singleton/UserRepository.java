package user.repository_singleton;

public final class UserRepository {
	
	private static UserRepository instance = null;

	private UserRepository() {
	}
	
	public static UserRepository getSingletonInstance() {
		if(instance == null) {
			synchronized (UserRepository.class) {
				if(instance == null) {
					instance = new UserRepository();
				}
			}
		}
		return instance;
	}
	
	public IUser dafault() {
		return customer();
	}
	
	public IUser customer() {
		return User.getUserInstance()
				.setFirstName("leh7")
				.setLastName("stor7")
				.setLogin("lehstorr7")
				.setPassword("asd1467")
				.setEmail("leh7@gmail.com")// optional field could be skipped
				.build();
	}
	
}
