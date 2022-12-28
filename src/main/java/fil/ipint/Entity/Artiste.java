package fil.ipint.Entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Data
@Entity
@Table(name= "artiste")
public class Artiste {
	/*un artiste à un nom et une petite discription et ses concerts */
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String nameArtiste;
	private String description;
	@OneToMany
	private List<Concert> concert = new ArrayList<>();


	public Artiste() {
	}



	public Artiste(String name) {
		this.nameArtiste=name;

	}


	public String getName() {
		return nameArtiste;
	}
	public void setName(String name) {
		this.nameArtiste = name;
	}


	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public List<Concert> getConcert() {
		return concert;
	}
	public void setConcert(List<Concert> concert) {
		this.concert = concert;
	}


	
	
	

}
