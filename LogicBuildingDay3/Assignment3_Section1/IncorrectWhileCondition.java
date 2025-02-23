/* ---------- Given Code ------

Snippet 2: 
public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count = 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 
 
*/
 
// ---------Corrected code -------
public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count >= 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
}

/* Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the 
`while` loop? 
 ans =
     In condition field, You can assign value, instead to check value is greater than or equal to zero. You can write condition like count >= 0
*/