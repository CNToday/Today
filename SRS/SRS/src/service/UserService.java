package service;

import dao.ProfessorWithPasswordDao;
import dao.StudentWithPasswordDao;
import dao.lianjie;
import model.ProfessorWithPassword;
import model.StudentWithPassword;

public class UserService {
	public StudentWithPassword getStudentWithPassword(String sssn){
		StudentWithPasswordDao spd=lianjie.createStudentWithPasswordDao();
		StudentWithPassword sp=spd.getStudentWithPassword(sssn);
		return sp;
	}
	
	public ProfessorWithPassword getProfessorWithPassword(String pssn){
		ProfessorWithPasswordDao ppd=lianjie.createProfessorWithPasswordDao();
		ProfessorWithPassword pp=ppd.getProfessorWithPassword(pssn);
		return pp;
	}
}
