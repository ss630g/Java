package ssingh6.a1;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jason Forsythe
 */
public final class Main {
    
    private char option;
    List<GameObject> objs;
    
    /**
     * Entry point for our application
     * @param args String[] of arguments
     */
    public static void main(String[] args){
        Main driver = new Main();
        driver.printMenu();
        driver.getSelection();
        while(driver.option != 'Q'){
            switch(driver.option){
                case 'M':
                    driver.printMenu();
                    break;
                case 'G':
                    driver.generate();
                    break;
                case 'V':
                    driver.view();
                    break;
                case 'S':
                    driver.sort();
                    driver.view();
                    break;
                case 'F':
                    driver.makeFile();
                    break;
                case 'Q':
                    System.out.println("Program closing");
                    break;
                default:
                    System.err.println("Sorry, I didn't understand you");
                    System.out.println();
                    driver.printMenu();
            }
            driver.getSelection();
        }
        
    }
    
    /**
     * Generate random classes of GameObject, Object3d, Pickup Character,
     * and Enemy. Store them in a List<T> object
     */
    void generate(){
       // super.generate();
        Random randy = new Random();
        this.objs = new ArrayList<>();
        this.objs.clear();
    
        GameObject[] sniff = { new GameObject(), new Object3d(), new Pickup(), new Enemy(), new Character() };
        for(int i = 0; i < 1000; i++) {
            this.objs.add(sniff[randy.nextInt(5)]);
        }
    }
    
    /**
     * Print out the contents of the List<T> object to the console
     */
    void view(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(this.objs.get(i).toString());
        }
    }
    
    /**
     * Sort the contents of the List<T> object by ID
     */
    void sort(){
        Collections.sort(this.objs);
    }
    
    /**
     * Make an HTML file and open it in the default browser
     */
    void makeFile(){
     /*String file = "home/stu/ssingh6/public_html/java/hw1.html";
     PrintWriter p = null;
     try 
     {
         p = new PrintWriter(file);
         p.println("<h1>YO</h1>");
     }
     catch (FileNotFoundException err)
     {
         err.printStackTrace();
     }
     finally 
     {
         if (p !=null)
         {
             p.close();
         }
     }*/
        File htmlFile = new File("./hw1.html");
        StringBuilder stuff = new StringBuilder();

        stuff.append("<!DOCTYPE html><h1>Gordon 420</h1><img src='./project6.jpg'><br><html><body><table>");
        for (GameObject obj : this.objs) {
            stuff.append(obj.toHtmlRow());
	    stuff.append("<table> <br></table>");
	    stuff.append("<table> <br></table>");
        }
        stuff.append("</table></body></html>");
        try {
            FileWriter aye = new FileWriter("./hw1.html", false);
            BufferedWriter ayeBuff = new BufferedWriter(aye);
            ayeBuff.write(stuff.toString());
            ayeBuff.close();
            Desktop.getDesktop().browse(htmlFile.toURI());
        }
        catch (Exception errrr) {
            errrr.printStackTrace();
            System.err.println("Bro file cannot write to html check it 420!!!");
        }
    }
    /**
     * Uses a Scanner object to get a user string
     * the char at the end of the string is then
     * used as the input and is changed to
     * uppercase.
     */
    
    void getSelection(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please choose an option: ");
        String line = scan.next();
        this.option = line.charAt(line.length()-1);
        this.option = java.lang.Character.toUpperCase(this.option);
    }
    
    /**
     * Gets the menu.txt file from the same folder that the class
     * is running from. Reads it line by line and prints it to the
     * console.
     */
    void printMenu(){
        try{
            InputStream input = this.getClass().getResourceAsStream("menu.txt");
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            
        } catch (IOException ex){
            System.err.println(ex);
        }  
    }
    
}
