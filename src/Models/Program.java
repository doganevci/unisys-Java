package Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Program")
public class Program {
	@Id
	@GeneratedValue 
	public long id;
	int Id;
	String Name;
}
