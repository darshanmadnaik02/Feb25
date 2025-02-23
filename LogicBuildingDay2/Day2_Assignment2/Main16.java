/* ---------- Given Code ---------
Snippet 17: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a ** b; 
 System.out.println(result); 
 } 
*/
// ------- Corrected code --------
import java.util.*;
public class Main16 { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = (int)(Math.pow(a,b)); 
 System.out.println(result); 
 } 
}

/* Q What compilation error occurs? Why is the ** operator not valid in Java?
   ans =
    error: illegal start of expression
    exponentiation is not supported using the ** operator. Instead, you would need to use the Math.pow() method.
*/ 