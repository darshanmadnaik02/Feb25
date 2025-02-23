/* ---------- Given Code ------

Snippet 3: 
public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num > 0); 
 } 
} 
*/
 
// ---------Corrected code -------
public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num < 10); 
 } 
} 

/* Q Error to investigate: Why does the loop only execute once? What is wrong with the loop condition in the `dowhile` loop?
 ans =
     loop condition is num > 0 is always true so loop execute infinite time. You can write condition like num <10
*/