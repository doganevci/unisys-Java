package Models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="User")
public class User {
	@Id
	@GeneratedValue 
	public long id;
	

	public String Name;
	
	public String Surname;
	
	public String Email;
	
	@Column (name = "Password")
	public String Password;
	
	public User()
	{
		
	}
	
	public User(String name, String email,String password) {
		Name=name;
		Email=email;
		Password=password;
	}
	
	public User(int Id,String name, String email,String password) {
		id=Id;
		Name=name;
		Email=email;
		Password=password;
	}
	
	public String toString() {
		return id + " " + Email + " " + Password;
	}
}
