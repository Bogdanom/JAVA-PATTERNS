package user.repository_file_work_in_progress;

import java.util.List;

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
				.setFirstName("leh8")
				.setLastName("stor8")
				.setLogin("lehstor8")
				.setPassword("asd1258")
				.setEmail("leh8@gmail.com")// optional field could be skipped
				.build();
	}
	
	public List<IUser> db() {
		return null;
	}
	
	public List<IUser> fromCsv(String filename) {
		return User.createUsers(new CSVReader(filename).getAllCells());
	}
	
	public List<IUser> fromCsv() {
		return fromCsv("users.csv");
	}
	/*
	public List<IUser> fromExcel(String filename) {
		return User.createUsers(new ExcelReader(filename).getAllCells());
	}
	
	public List<IUser> fromExcel() {
		return fromExcel("users.xls");
	}
	*/
}
