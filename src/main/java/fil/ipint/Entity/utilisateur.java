package fil.ipint.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;



@Entity
@Table(name= "user")
public class utilisateur {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idUser;

    private String name;
    private String prenom;
    private String adresse;
    private String email;
    private String password;
    @OneToMany
    private Collection<Billet> billet;



    public utilisateur(long id , String name, String prenom, String adresse, String email, String password) {
        this.idUser=id;
        this.name = name;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email=email;
        this.password=password;
        this.billet = new ArrayList();
    }

    public utilisateur(){
        super();
    }


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public Collection<Billet> getBillet() {
        return billet;
    }
    public void setBillet(Collection<Billet> billet) {
        this.billet = billet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    public void addBillet(Billet b){
        this.billet.add(b);
    }
}
