/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import pkginterface.IRmi;

/**
 *
 * @author vincent
 */
public class RmiClient{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            
        // TODO code application logic here
        Registry rg = LocateRegistry.getRegistry("127.0.0.1",1010);
        
        IRmi rmi = (IRmi)rg.lookup("server");
//        valeur de a, b, choix
        
//        int a = new 
int res;

        res = rmi.calculer(1, 4, 2);
            System.out.println(res);
            
        } catch (Exception e) {
            System.out.println(e);
        }
 
    }
    
    
    
}
