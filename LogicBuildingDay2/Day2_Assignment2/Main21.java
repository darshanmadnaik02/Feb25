/* --------- Given code ----------
Snippet 22: 
public class Main { 
 public static void main(String[] args) { 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
 } 
} 
*/
// ----- Corrected code -----
public class Main21 { 
 public static void main(String[] args) { 
      displayMessage();
 } 
 static void displayMessage() { 
 System.out.println("Message"); 
 } 
} 
/* Q What syntax error occurs? Can a method be declared inside another method?
   ans = 
   You cannot define a method inside the body of another method in Java.
    
*/