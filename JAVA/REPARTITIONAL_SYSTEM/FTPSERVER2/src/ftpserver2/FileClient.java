/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftpserver2;

import java.io.*;
import java.net.*;

/**
 *
 * @author vincent
 */
public class FileClient {
    public static void main(String[] args) {
        try {
            byte[]b = new byte[200027];
            Socket sr = new Socket("localhost",6777);
            InputStream is = sr.getInputStream();
            FileOutputStream fr = new FileOutputStream("/Users/vincent/Desktop/fileClient.txt");
            is.read(b, 0, b.length);
            fr.write(b, 0, b.length);
        } catch (Exception e) {
        }
    }
    
    
}
