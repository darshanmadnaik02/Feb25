/* ---------- Given Code ------

Snippet 10: 
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num = 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
}


*/
 
// ---------Corrected code -------
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num > 0) { 
 System.out.println(num); 
 num--; 
 } 
 } 
}

/* Q Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?
   ans = You can write loop condition like this: while(num > 0)


*/