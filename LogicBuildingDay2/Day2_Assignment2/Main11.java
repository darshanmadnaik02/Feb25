/* ---------- Given Code -----
 Snippet 12: 
public class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
} 

*/

// --------- Corrected code ------

public class Main11 { 
 public static void main(String[] args) { 
 int a = 5;
 while (a > 0) { 
 System.out.println("Loop"); 
 a--;
 } 
 } 
} 


/* Q What happens when you run this code? How can you avoid infinite loops?

   ans = 
    Program will run infinite loop.
    Set the condition that eventually causes the loop to terminate
*/