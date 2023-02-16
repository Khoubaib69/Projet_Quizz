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

import fr.dawan.quizzapp.entities.Reponse;
import fr.dawan.quizzapp.service.IReponseService;

@RestController
@RequestMapping("/api/reponse")
public class ReponseController {
	@Autowired 
	private IReponseService service;
	@GetMapping(produces="application/json")
	public List<Reponse> findAll(){
	return service.findAll();
	}
	
	@GetMapping(value = "/{id:[0-9]+}", produces ="application/json")
	
	public Reponse findQuizzById(@PathVariable long id)   {
		
	return service.findById(id);
	}
	
	@PostMapping(produces ="application/json", consumes ="application/json")
	 public Reponse createReponse (@RequestBody Reponse reponse) {
		 return service.createReponse(reponse);
	 }
	
 	@DeleteMapping(value ="/delete/{id:[0-9]+}", produces = MediaType.TEXT_PLAIN_VALUE)
 	public void deleteReponseById(@PathVariable long id)   {
		
		 service.deleteReponseById(id);
 		}
 	 @PutMapping( value ="/update/{id:[0-9]+}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	  public void updateQuizz(@RequestBody Reponse reponse, @PathVariable long id)
	  {
		  service.updateReponseById(reponse,id);
		  //service.createUser(user);
	  }

}
