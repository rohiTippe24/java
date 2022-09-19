//  File Handling i Java

import java.io.*;
import java.util.Scanner;

public class fileHandling {
  
  public static void main (String[] args) {
    
    //  CREATE NEW FILE
    
     File f = new File("JAVA.txt");
    
    try {
      f.createNewFile();
      System.out.println("file created succesfully");
    } catch (Exception e) {
      System.out.println("Exception :-  " + e);
    }
    
    
    //  WRITE FILE
   
   /* 
    try {
      FileWriter fw = new FileWriter("JAVA.txt");
      fw.write("Java is prity good programing language....");
      System.out.println("file written succesfully");
      fw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
    */
    
    //  READ FILE
    
    /*
    File myFile = new File("JAVA.txt");
    
    try {
      Scanner sc = new Scanner(myFile);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
      
      // try {
      //   while (true) {
      //     System.out.println(sc.nextLine());
      //   }
      // } catch(Exception e) {
      // }
      
    } catch(Exception e) {
      System.out.println(e);
    }
    */
    
    //  Delet File
   
   /* 
    File file = new File("JAVA.txt");
    try {
      file.delete();
      System.out.println("Deleted : " + file.getName() );
    } catch(Exception e) {
      System.out.println("File not Found");
    }
    */
  }
  
  
}
