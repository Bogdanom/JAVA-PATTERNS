package user.repository_file;

import java.util.List;

public class ApplUser {

	public static void main(String[] args) {

	
		IUser user = UserRepository.getSingletonInstance().customer();	
		System.out.println("Users from UserRepository.class = " + user); 
		System.out.println("user = " + user.getFirstName());
		System.out.println("====================================");
		List<IUser> users = UserRepository.getSingletonInstance().fromCsv();
		System.out.print("Users from csv.file = " + users); 
	}

}