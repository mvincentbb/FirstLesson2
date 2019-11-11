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
public class Commentaires {
    @Id
    private Integer id;
    private Integer publication_id;
    private Integer user_id;
    private String contenu;
}
