/* ---------- Given Code ------

Snippet 7: 
public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
}
*/
 
// ---------Corrected code -------
public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count = 0; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
}

/* Q  Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop 
variable properly?
 ans =  Code produce a compilation error beacuse you can not initialize count variable. You can initialize the count variable (int count = 0;)
     
*/