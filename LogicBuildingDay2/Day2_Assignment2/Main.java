/* ------- Given Code -------
public class Main { 
 public void main(String[] args) {      // Main method is not static 
 System.out.println("Hello, World!"); 
 } 
} 
*/
// ------ Corrected Code -------

public class Main { 
 public static void main(String[] args) { // Define main method as static because JVM can call main method without creating object 
 System.out.println("Hello, World!"); 
 } 
} 