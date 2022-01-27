package com.userdetailes.userdetailes1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;

	//import org.springframework.beans.factory.annotation.Autowired(requried=true);

	import org.springframework.stereotype.Service;


		@Service
		public class UserDataService {
			@Autowired 
			private UserDataRepo userDataRepository;
			/*private List<UserData> User = new ArrayList <UserData> (Arrays.asList(
					new UserData("001","deeksha","gunda","1@email.com"),
					new UserData("002","gdeeksha","gunda1","1@email.com")
					));*/
					
			public List <UserData> getdata(){
			       return userDataRepository.findAll();
			}
			public void addUserData(UserData userdata) {
				userDataRepository.save(userdata);
			}
			public UserData updatedata(String id,UserData userdata) {
				  return userDataRepository.save(userdata);
			}
			public void deletedata(String id) {
				userDataRepository.deleteById(id);
			}
	}


