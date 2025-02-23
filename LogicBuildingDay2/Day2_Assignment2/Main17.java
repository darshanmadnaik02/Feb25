/* --------- Given code --------
Snippet 18: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
}
*/
// ---------- Corrected code -------
public class Main17 { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
}
/* Q What is the output of this code? How does operator precedence affect the result?
   ans = 
     Output of code is 20.
     first multiplication is done then addition. The operator precedence rules is multiplication has higher precedence than addition.
*/