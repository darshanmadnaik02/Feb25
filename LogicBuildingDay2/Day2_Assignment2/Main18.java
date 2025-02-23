/* ----- Given code ---------

Snippet 19: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 
*/
// --------Corrected code------
public class Main18 { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a / b; 
 System.out.println(result); 
 } 
} 
/* Q What runtime exception is thrown? Why does division by zero cause an issue in Java?
    ans = 
    Runtime exception is java.lang.ArithmeticException: / by zero
    For integers, division by zero is considered an error because there is no valid integer result for this operation.
*/