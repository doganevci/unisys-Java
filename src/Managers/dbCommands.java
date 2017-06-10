package Managers;

import java.util.List;
import java.util.Map;

import com.dieselpoint.norm.Database;

import Models.User;

public class dbCommands {
	public Database db ;
	
	
	public dbCommands() {
		db=DB.getInstance().db;
	}
	
	public boolean checkIfIcanLogin(String uName,String pass)
	{
		List<User> list= db.where("Email=?",uName).where("Password=?",pass).results(User.class);
		
		
		if(list.size()>0)
			return true;
		
		return false;
		
	}
	
	
	public boolean addUser(String uName,String pass)
	{
		List<User> list= db.where("Email=?",uName).where("Password=?",pass).results(User.class);
		
		
		if(list.size()>0)
			return true;
		
		return false;
		
	}
	
}
