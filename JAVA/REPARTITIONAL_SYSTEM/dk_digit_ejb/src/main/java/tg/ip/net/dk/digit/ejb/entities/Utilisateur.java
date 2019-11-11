/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.dk.digit.ejb.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author vincent
 */

@Entity
public class Utilisateur {
    @Id
    private Integer id;
    private String nom;
    private String prenom;
    private String username;
    private String email;
    private String telephone;
    private String role;
    
    
    
    
}
