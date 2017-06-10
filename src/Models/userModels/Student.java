package Models.userModels;

import java.util.ArrayList;

import javax.persistence.Table;

import Models.Program;
import Models.User;
import Models.workModels.Lecture;


public class Student extends User{
	
	public Student(String name, String email, String password) {
		super(name, email, password);
		// TODO Auto-generated constructor stub
	}

	Program registeredProgram;
	ArrayList<Lecture> registeredLectures;
	
	Lecturer advisorLecturer;
	
}
