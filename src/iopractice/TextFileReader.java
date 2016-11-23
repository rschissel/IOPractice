/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopractice;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan Schissel
 */
public class TextFileReader {

    private BufferedReader in = null;
    private File file;

    public void readFile() throws Exception {
        file = new File("src/contactList.txt");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String dataLine = in.readLine();
            while (dataLine != null) {
                System.out.println(dataLine);
                dataLine = in.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("Error!");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }

    public void readFile(int elementIndex) {
        List<String> contactInfo = new ArrayList<>();
        file = new File("src/contactList.txt");
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String dataLine = in.readLine();
            while (dataLine != null) {
                contactInfo.add(dataLine);
                dataLine = in.readLine();
            }
        } catch (IOException ioe) {
            System.out.println("Error!");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        for (String s : contactInfo) {
            System.out.println(s);
        }
    }
}
