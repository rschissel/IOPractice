/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopractice;

import java.io.*;

/**
 *
 * @author Ryan Schissel
 */
public class TextFileReader {
    BufferedReader in = null;
    File file = new File("C:\temp\names.txt");
    public void doInput(){
        BufferedReader in = null;
        
        try{
            in = new BufferedReader(new FileReader(file));
            String dataLine = in.readLine();
            while (dataLine != null){
                System.out.println(dataLine);
                dataLine = in.readLine();
            }
        }
         catch(IOException ioe){
             System.out.println("Error!");
         }
         finally{
            try{
            in.close();
            }
            catch(Exception e){
                
            }
        }
    }
    
}
