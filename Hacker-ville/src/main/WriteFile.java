/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;

/**
 *
 * @author user
 */
public class WriteFile {
    private static final String FILENAME =  Paths.get("").toAbsolutePath().toString()+"\\src\\main\\file-write.txt";
    
     public static void main(String[] args) {
         try {
            PrintWriter pw = new PrintWriter(FILENAME);
            pw.println("sss is easy to use.");
            pw.println("dada  ");
            pw.println(1234);
            pw.close();
         } catch (IOException e) {
    }
  }
     
}
