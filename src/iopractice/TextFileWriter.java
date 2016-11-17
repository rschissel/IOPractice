/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ryan Schissel
 */
public class TextFileWriter {
    private File file;
    private boolean append;
    
    public TextFileWriter(boolean append) {
        this.append = append;
    }
    public void createNewFile(String path, String fileName, String fileFormat){
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append(fileName);
        sb.append(fileFormat);
        file = new File(sb.toString());
    }
    public void doOutput(Contact contact) throws IOException{
        
        PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(file, append)));
	out.println(contact.getFirstName());
        out.println(contact.getLastName());
        out.println(contact.getAddress());
        out.println(contact.getStreet());
        out.println(contact.getCity());
        out.println(contact.getState());
        out.println(contact.getZip());
        out.println("-");
    }
}
