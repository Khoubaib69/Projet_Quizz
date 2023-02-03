package fr.dawan.quizzapp.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Users  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6832247712707550439L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long userId ;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	@OneToMany(mappedBy ="user")
	private Collection<QuizzTest> quizzTest;
	@ManyToOne
	@JoinColumn(name="CODE_ROLE")
	private Roles role;
	

}
