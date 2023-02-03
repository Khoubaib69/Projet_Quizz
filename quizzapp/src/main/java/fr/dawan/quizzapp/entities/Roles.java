package fr.dawan.quizzapp.entities;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Roles implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3872184173539697865L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long roleId;
	private String roleName;
	@OneToMany(mappedBy ="role")
	private Collection<Users> users;

}
