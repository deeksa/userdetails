package com.userdetailes.userdetailes1;


	




import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

	@Document(collection="users")
	public class UserData {
		
		
		@Id
		private String id;
		private String firstname;
		private String lastname;
		
		private String mail;
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
		private Date dateofbirth;
	
		
		public UserData() {
			
		}
		

		public UserData(String id, String firstname, String lastname,String mail,Date dateofbirth) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.mail = mail;
			this.dateofbirth=dateofbirth;
			
		}


	


		


		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		

		public Date getDateofbirth() {
			return dateofbirth;
		}


		public void setDateofbirth(Date dateofbirth) {
			this.dateofbirth = dateofbirth;
		}


		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}
	}




