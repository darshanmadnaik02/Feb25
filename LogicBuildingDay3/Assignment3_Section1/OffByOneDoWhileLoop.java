/* ---------- Given Code ------

Snippet 8: 
public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} 

*/
 
// ---------Corrected code -------
public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num <= 5); 
 } 
} 

/* Q Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the numbers from 1 to 5? 
 ans = This loop print unexpected numbers beacuse your condition is worng. You can write condition like this: while(num <= 5) and increment the num variable (num++)
     
*/