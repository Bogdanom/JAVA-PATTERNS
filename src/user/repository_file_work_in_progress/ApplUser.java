package user.repository_file_work_in_progress;

import java.util.List;

public class ApplUser {

	public static void main(String[] args) {

	
//		IUser user = UserRepository.getSingletonInstance().customer();	
//		System.out.println(user); 
//		System.out.println("user = " + user.getFirstName());
		List<IUser> users = UserRepository.getSingletonInstance().fromCsv();
		System.out.println("users = " + users); 
	}

}