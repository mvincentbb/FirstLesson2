/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpserver2;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vincent
 */
public class FileServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ServerSocket s = new ServerSocket(6777);
            Socket sr = s.accept();
            FileInputStream fr = new FileInputStream("/Users/vincent/Desktop/fileServeur.txt");
            byte b [] = new byte[2002];
            fr.read(b, 0, b.length);
            OutputStream os = sr.getOutputStream();
            os.write(b, 0, b.length);
        } catch (IOException ex) {
            Logger.getLogger(FileServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
