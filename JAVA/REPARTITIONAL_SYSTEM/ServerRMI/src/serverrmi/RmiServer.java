/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverrmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import pkginterface.IRmi;

/**
 *
 * @author vincent
 */
public class RmiServer extends UnicastRemoteObject implements IRmi {

    public RmiServer() throws RemoteException {
        super();
    }

    @Override
    public Integer calculer(int a, int b, int choix) {
        switch (choix) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a / b;
            case 4:
                return a * 4;

        }
        return null;
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
    public static void main(String[] args) {

        try {
            Registry rg = LocateRegistry.createRegistry(1010);
            rg.rebind("server", new RmiServer());
            System.out.println("Server Started");
        } catch (Exception e) {
        }

    }

}
