/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne;
import com.google.gson.annotations.SerializedName;
/**
 *
 * @author vincent
 */
public class Personne {

    /**
     * @param args the command line arguments
     */
    
    public String nom;
    public String prenom;
    public int age;
    public String adresse;
    public int telephone;
    public String sexe;

    public Personne(String nom, String prenom, int age, String adresse, int telephone, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.adresse = adresse;
        this.telephone = telephone;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", adresse=" + adresse + ", telephone=" + telephone + ", sexe=" + sexe + '}';
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
