package user.repository_file;

import java.util.List;

public final class UserRepository {
	
	private static UserRepository instance = null;
	
	private final static String PATH ="C:\\JAVA-CODE-2022\\JAVA-PATTERNS\\users.csv";
	
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
				.setFirstName("leg8")
				.setLastName("stor8")
				.setLogin("legstor8")
				.setPassword("asd1258")
				.setEmail("leg8@gmail.com")// optional field could be skipped
				.build();
	}

	public List<IUser> fromCsv() {
		return User.createUsers(new CSVReader().getAllCells(PATH));
	}
}
