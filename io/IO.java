/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author galindo
 */
public class IO {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        int c;

        FileInputStream file = new FileInputStream("test.txt");
        BufferedInputStream buffIn = new BufferedInputStream(file);

        try (InputStream in = new LowerCaseInputStream(buffIn)) {
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            
            System.out.println("");
        }

    }

}
