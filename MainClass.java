package project_gui;

import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class MainClass {

    public static void main(String[] args) {
        try {
            // wirte the file path 
            File myObj = new File("path here");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        Calculator calc = new Calculator(); 

    }
}
