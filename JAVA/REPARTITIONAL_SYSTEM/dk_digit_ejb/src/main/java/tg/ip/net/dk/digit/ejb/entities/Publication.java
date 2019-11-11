/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author vincent
 */
@Entity
@Setter
@Getter
public class Publication  implements Serializable{
//    public Publication(){}
  
//    
//    
//  
//    
//    @Column
//    private Integer prix;
//    
//    @Column
//    private String description;
   
    
    @Embeddable
    public class Id implements Serializable{
        @Column
        private Integer bienId;
        
        @Column
        private Integer utilisateurId;

        public Integer getUtilisateurId() {
            return utilisateurId;
        }

        public void setUtilisateurId(int utilisateurId) {
            this.utilisateurId = utilisateurId;
        }
        

        public Integer getBienId() {
            return bienId;
        }

        public void setBienId(int bienId) {
            this.bienId = bienId;
        }
        
    }
    
    @EmbeddedId
    private  Id id = new Id();
    
    @Temporal(TemporalType.DATE)
    @Column
    private Date datePublication;
    
            
     @ManyToOne()
    @JoinColumn(name ="bien_id", insertable = false, updatable = false)
    private Bien bien;
    
    @ManyToOne()
    @JoinColumn(name ="Utilisateur_id", insertable = false, updatable = false)
    private Utilisateur utilisateur;
    
    @ManyToOne()
    @JoinColumn(name ="object_id",insertable = false, updatable = false)
    private Object_publication object;
    
    
   
    
    
}
