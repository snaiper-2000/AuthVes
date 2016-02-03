package User;

public class User {
	
	private String surname;//ôàìèëèÿ
	private String name;
	private String middleName;//îò÷åñòâî
	private String login = "admin";
	private String password = "root";
	private String mobileTelephoe;
	private String email;
	
	
	public User(){
		
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMobileTelephoe() {
		return mobileTelephoe;
	}


	public void setMobileTelephoe(String mobileTelephoe) {
		this.mobileTelephoe = mobileTelephoe;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
