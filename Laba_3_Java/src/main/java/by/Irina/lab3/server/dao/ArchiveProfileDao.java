package by.Irina.lab3.server.dao;

import java.util.List;

import by.Irina.lab3.beans.AccountType;
import by.Irina.lab3.beans.ArchiveProfile;

public interface ArchiveProfileDao {
	List<ArchiveProfile> getAll();
	String login(String username, String password);
	AccountType getAccType(String authToken);
	void logout(String authToken);
}
