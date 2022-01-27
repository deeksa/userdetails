package com.userdetailes.userdetailes1;


	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


	import java.util.List;
	@CrossOrigin(origins="http://localhost:3000")

	@RestController
	public class UserDataController {
		
		@Autowired
		private UserDataService userDataService; 
		
		@RequestMapping("/name")
		public List<UserData>getAllData()
		{
				return userDataService.getdata();
			
		}
		@RequestMapping(method=RequestMethod.POST,value="/set")
		public void addUserData(@RequestBody UserData userdata)
		
		{
			
			 userDataService.addUserData(userdata);
		}
		@RequestMapping(method=RequestMethod.PUT,value="/updatename/{id}")
		public UserData updatedata(@RequestBody UserData userdata,@PathVariable String id) {
			return userDataService.updatedata(id,userdata);
			
		}
		@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
		public void deletedata(@PathVariable String id) {
			 userDataService.deletedata(id);
		}

}


