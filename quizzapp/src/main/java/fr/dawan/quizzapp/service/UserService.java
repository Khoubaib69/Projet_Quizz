package fr.dawan.quizzapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.dawan.quizzapp.entities.Users;
import fr.dawan.quizzapp.enums.Roles;
import fr.dawan.quizzapp.repository.UserRepository;
@Service
@Transactional
public class UserService implements IUserService{
@Autowired
private UserRepository uRepository;
	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return uRepository.findAll();
	}

	@Override
	public Users createUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> findAllAdmin() {
		return uRepository.findAllByRole(Roles.ADMIN);


	}

	@Override
	public List<Users> findAllUsers() {
		// TODO Auto-generated method stub
		return uRepository.findAllByRole(Roles.USER);
	}

	@Override
	public Users findUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users updateUserById(Users user) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
