package Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Work")
public class Work {
	@Id
	@GeneratedValue 
	public long id;
	int Id;
	Program registeredProgram;
}
