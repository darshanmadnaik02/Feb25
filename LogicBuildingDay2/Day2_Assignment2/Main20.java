/* --------- Given code ------
Snippet 21:
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
} 
*/
// ------ Corrected code --------
public class Main20 { 
  public static void main(String[] args) { 
  System.out.println("Hello, World!"); 
  // Missing closing brace here
  }
} 
/* Q What does the compiler say about mismatched braces?
   ans = 
   compiler say  error: reached end of file while parsing
*/