/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author vincent
 */
public interface IRmi extends Remote {
    public Integer calculer (int a, int b, int choix) throws RemoteException;
    
    
}
