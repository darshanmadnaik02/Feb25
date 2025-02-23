/* ----------- Given Code --------------

Snippet 11: 
public class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
} 

*/

// -------------- Corrected code ----------
public class Main10 { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
} 

/* Q What runtime exception do you encounter? Why does it occur?
   ans = 
   Error:  Array Index Out Of Bounds Exception
   Why does it occur?
   Array length is 3 and we can access index 5 element so error is occur

*/

