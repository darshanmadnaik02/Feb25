/* ----------- Given code ---------

Snippet 6: 
public class Main { 
 public static void main(String[] args) { 
 int x = y + 10;                          //Error is The variable y is used in the expression y + 10, but it has not been declared in code
 System.out.println(x); 
 } 
} 

*/
// ---------- Corrected code -------

public class Main5 { 
 public static void main(String[] args) { 
 int y = 10;            // Declaring a variable helps the compiler know how to allocate memory for it
 int x = y + 10; 
 System.out.println(x); 
 } 
} 
