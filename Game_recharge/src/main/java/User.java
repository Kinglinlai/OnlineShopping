
public class User {
	private String firstname, lastname, password, accname, phone;
	
		
		public User() {
			super();
		}
	
		public User(String firstname, String lastname, String password, String accname, String phone) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.accname = accname;
			this.password = password;
			this.phone = phone;
		}
	
		public String getFname() {
			return firstname;
		}
	
		public void setFname(String firstname) {
			this.firstname = firstname;
		}
		
		public String getLname() {
			return lastname;
		}
	
		public void setLname(String lastname) {
			this.lastname = lastname;
		}
	
	
		public String getPassword() {
			return password;
		}
	
		public void setPassword(String password) {
			this.password = password;
		}
	
		public String getAccount() {
			return accname;
		}
	
		public void setAccount(String accname) {
			this.accname = accname;
		}
	
		public String getPhone() {
			return phone;
		}
	
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
}
