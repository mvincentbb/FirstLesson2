/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author vincent
 */
public class TestSerialisation {
    public static void main(String[] args) {
         final GsonBuilder builder = new GsonBuilder();
    final Gson gson = builder.create();

    Personne personnes = new Personne("vincent","vincent",26,"klikame",7888,"M");

    final String json = gson.toJson(personnes);
    System.out.println("Resultat = " + json);
    }
          
    
}
