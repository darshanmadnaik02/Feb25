/* ---------- Given Code ------

Snippet 5: 
public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i++) { 
 System.out.println(i); 
 } 
 } 
} 

 
*/
 
// ---------Corrected code -------
public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i--) { 
 System.out.println(i); 
 } 
 } 
} 

/* Q Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop?
 ans =
     Update statement to i-- so that i decreases by 1 after each iteration.
*/