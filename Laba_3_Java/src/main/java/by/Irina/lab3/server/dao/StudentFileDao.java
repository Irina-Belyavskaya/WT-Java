package by.Irina.lab3.server.dao;

import java.util.List;

import by.Irina.lab3.beans.StudentFile;

public interface StudentFileDao {
	
	List<StudentFile> getAll();
	StudentFile get(int StudentId);
	boolean add(StudentFile student);
	boolean edit(StudentFile changedStudent);
}
