import javax.persistence.Table;

import com.dieselpoint.norm.Database;
import com.zaxxer.hikari.HikariConfig;

import Managers.DB;
import Models.User;

public class theMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("test®");
		DB.getInstance();

		//DB.getInstance().db.insert(new User("Doğan", "doganevci@gmail.com", "1234"));
		
		
	}


}
