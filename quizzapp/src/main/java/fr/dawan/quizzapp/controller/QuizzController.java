package fr.dawan.quizzapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dawan.quizzapp.entities.Quizz;
import fr.dawan.quizzapp.service.IQuizzService;



@RestController
@RequestMapping("/api/quizz")
public class QuizzController {
	@Autowired 
	private IQuizzService service;
	@GetMapping(produces="application/json")
	public List<Quizz> findAll(){
	return service.findAll();
	}
	
	@GetMapping(value = "/{id:[0-9]+}", produces ="application/json")
	
	public Quizz findQuizzById(@PathVariable long id)   {
		
	return service.findById(id);
	}
	
	@PostMapping(produces ="application/json", consumes ="application/json")
	 public Quizz createQuizz (@RequestBody Quizz quizz) {
		 return service.createQuizz(quizz);
	 }
	
 	@DeleteMapping(value ="/delete/{id:[0-9]+}", produces = MediaType.TEXT_PLAIN_VALUE)
 	public void deleteQuizzById(@PathVariable long id)   {
		
		 service.deleteQuizzById(id);
 		}
 	 @PutMapping( value ="/update/{id:[0-9]+}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	  public void updateUser(@RequestBody Quizz quizz, @PathVariable long id)
	  {
		  service.updateQuizzById(quizz,id);
		  //service.createUser(user);
	  }
}


