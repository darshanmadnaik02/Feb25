/* ---------- Given Code ------

Snippet 1: 
public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i--) { 
 System.out.println(i); 
 } 
 } 
} 
*/
 
// ---------Corrected code -------
public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i++) { 
 System.out.println(i); 
 } 
 } 
} 

/* Q Why does this loop run infinitely? How should the loop control variable be adjusted?
 ans =
     The loop control variable i is being decremented , instead of being incremented. This means that i is always getting smaller. The condition i < 10 will always be true.
     To avoid the infinite loop, you should change i-- to i++.
*/