package by.Irina.lab3.server.service;

import java.util.List;
import by.Irina.lab3.beans.*;

public interface ServerService {
	String login(String userame, String password);
	AccountType getAccountType(String authToken);
	void logout(String authToken);
	List<StudentFile> getAll();
	StudentFile get(int id);
	boolean add(StudentFile student);
	boolean edit(StudentFile changedStudent);
}
