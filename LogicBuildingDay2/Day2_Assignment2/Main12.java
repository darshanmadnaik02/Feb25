/* --------- Given Code ----------

Snippet 13: 
public class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
}
*/

// -------- Corrected code -------

public class Main12 { 
 public static void main(String[] args) { 
 String str = "Hello"; 
 System.out.println(str.length()); 
 } 
}
 


/*  Q What exception is thrown? Why does it occur?
      ans = 
      Exception in thread "main" java.lang.NullPointerException
      The exception occurs because you're trying to call the method length() on null object reference
*/