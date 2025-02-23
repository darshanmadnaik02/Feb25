/* ----------- Given Code ---------
Snippet 16: 
public class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
} 
*/

// -------- Corrected code --------
public class Main15 { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = (double)num / 4; 
 System.out.println(result); 
 } 
} 
/* Q What is the result of this operation? Is the output what you expected?
   ans =
    Both operands num and 4 are integers so output will be integer
    Solution is Cast num to double
*/
