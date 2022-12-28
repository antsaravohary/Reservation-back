package fil.ipint.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Adresse {
	/*une adrees à une ville une rue  */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private String ville;
	private String rue;
	
	public Adresse(String ville,String rue) {
		this.ville= ville;
		this.rue=rue;
	}
	
	public String getVille() {
		return ville;
	}
	
	public String getRue() {
		return rue;
	}

}
