package fil.ipint.Entity;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Data
@Entity
@Table(name="Concerts")
public class Concert {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private Long idConcert;
	private String titre;
	private LocalDate  date ; 
	private double prix ;
	@OneToMany
	private List<Artiste> artistes ;
	@OneToMany
	private List<Salle> salle ;
	@OneToMany
	private List <Billet> billet;


	
	public Concert(Long id ,String titre, LocalDate date, double prix) {
		this.titre = titre;
		this.date = date;
		this.prix = prix;
		this.idConcert=id;

	}

	public Concert (){
		this.artistes = new ArrayList<Artiste>();
		this.salle = new ArrayList<Salle>();
		this.billet = new ArrayList <Billet>();
	}



	public Concert(String titre,double prix) {
		this.titre = titre;
		this.prix=prix;
	}



	public Long getId() {
		return idConcert;
	}

	public void setId(Long id) {
		this.idConcert = id;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public List<Artiste> getArtistes() {
		return artistes;
	}
	public void setArtistes(List<Artiste> artistes) {
		this.artistes = artistes;
	}
	public List<Salle> getSalle() {
		return salle;
	}
	public void setSalle(List<Salle> salle) {
		this.salle = salle;
	}
	public List<Billet> getBillet() {
		return billet;
	}
	public void setBillet(List<Billet> billet) {
		this.billet = billet;
	}
	

}
