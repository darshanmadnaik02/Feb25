/* -------- Given code ------
Snippet 20: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World")         //semicolon is missing
 } 
}
*/ 
// -------- Corrected code -------
public class Main19 { 
 public static void main(String[] args) { 
 System.out.println("Hello, World"); 
 } 
} 
/* Q What syntax error occurs? How does the missing semicolon affect compilation
   ans = 
    error: ';' expected
    ;  is used to mark the end of a statement. Without it the Java compiler cannot recognize where the statement ends.
   
*/