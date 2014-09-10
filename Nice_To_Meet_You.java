/*
 * Lesson 3 - Unit 1 - User Input and Variables 
 */

import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class Nice_To_Meet_You{


     public static void main (String str[]) throws IOException {

          Scanner scan = new Scanner (System.in);
 
          String n;
 
          System.out.println("What is your favorite snack?");
          n = scan.nextLine();
          System.out.println( n + ". Sounds delicious.");

          

     }

}