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
				.setFirstName("leh5")
				.setLastName("stor5")
				.setLogin("lehstor5")
				.setPassword("asd125")
				.setEmail("leh5@gmail.com")// optional field could be skipped
				.build();
	}
	
}
