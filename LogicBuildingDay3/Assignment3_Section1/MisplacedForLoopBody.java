/* ---------- Given Code ------

Snippet 6: 
public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) 
 System.out.println(i); 
 System.out.println("Done"); 
 } 
} 


 
*/
 
// ---------Corrected code -------
public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++)
 { 
 System.out.println(i); 
 System.out.println("Done"); 
 }
 } 
} 

/* Q Error to investigate: Why does this loop not print numbers in the expected order? What is the problem with the 
initialization and update statements in the `for` loop?
 ans =
     The for loop only has one statement directly following it, which is System.out.println(i);. Therefore, only that statement is considered part of the loop. The System.out.println("Done"); statement that comes after the loop is not part of the loop because it isn't enclosed in curly braces {}.
*/