package Managers;

import com.dieselpoint.norm.Database;

import Models.Program;
import Models.User;
import Models.Work;
import Models.userModels.Student;

public class DB {
  // singleton db kurulumu class'ı kullanıldı
	private static DB instance = null;
	public Database db ;
	
	   protected DB() {
		   System.setProperty("norm.jdbcUrl", "jdbc:mysql://localhost:8889/university?useSSL=false");
			System.setProperty("norm.user", "root");
			System.setProperty("norm.password", "root");
			System.setProperty("norm.db", "inventory");
			

			db= new Database();
			
			try {
				db.createTable(Work.class);
				db.createTable(Program.class);
				db.createTable(User.class);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			createDBSample();
	   }
	   
	   
	   public static DB getInstance() {
	      if(instance == null) {
	         instance = new DB();
	      }
	      return instance;
	   }
	   
	   
	   public void createDBSample()
	   {

		  // db.insert(new User(1,"Doğan", "doganevci@gmail.com", "1234"));
		   
		  
	   }
	
}
