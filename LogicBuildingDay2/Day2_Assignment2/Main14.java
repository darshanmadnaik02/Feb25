/* -------- Given code -------

Snippet 15: 
public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} 

*/

public class Main14 { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = (int) (num1 + num2); 
 System.out.println(result); 
 } 
} 

/*  Q What error occurs when compiling this code? How should you handle different data types 
      in operations

    ans = 
        Error = incompatible types :  possible lossy conversion from double to int
        How should you handle different data types in operations
        you can explicitly cast the result to int 
        for example: int result = (int) (num1 + num2);
*/