package DAO;

import java.util.List;

import passwordJAVA.loginModel;


public interface UserDAO {
	public void addUser(loginModel p);
	public void updatePerson(loginModel p);
	public List<loginModel> listPerson ();
	public loginModel getUserById(int id);
	public void removeUser(int id);
}
