/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopractice;

import java.util.Scanner;

/**
 *
 * @author Ryan Schissel
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        TextFileWriter textWriter = new TextFileWriter(true);
        TextFileReader textReader = new TextFileReader();
        Contact contact = new Contact();
        contact.setFirstName("Ivan");
        contact.setLastName("Khil");
        contact.setAddress("322");
        contact.setStreet("Assasins Ct");
        contact.setCity("Moscow");
        contact.setState("Idaho");
        contact.setZip("23484");
        textWriter.createNewFile("src", "contactList", "txt");
        textWriter.writeFile(contact);
        textReader.readFile();
        textReader.readFile(2);
    }
    
}
