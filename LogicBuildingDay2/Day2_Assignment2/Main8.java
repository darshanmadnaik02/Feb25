/* --------- Given Code ---------

Snippet 9: 
public class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} 

*/

// ------- Corrected Code -----------
public class Main8 { 
 public static void main(String[] args) { 
 int a = 10; 
 System.out.println(a); 
 } 
} 

/* Q What error occurs? Why can't reserved keywords be used as identifiers?
   ans = 
    Error is reserved keyword used as identifier.
    Why can't reserved keywords be used as identifiers:
    1. It would be impossible for the compiler to distinguish between a variable name and a keyword
    2. To maintain consistency in the language
*/