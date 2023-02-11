package fr.dawan.quizzapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.quizzapp.entities.Users;
import fr.dawan.quizzapp.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired 
	private UserService service;
	@GetMapping(produces="application/json")
public List<Users> findAll(){
	return service.findAll();
	
}
	@GetMapping(value = "/admin" ,produces="application/json")
public List<Users> findAllAdmin(){
	return service.findAllAdmin();
	
}
	
	

}
