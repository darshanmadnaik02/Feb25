/* ----------- Given code --------
Snippet 12: 
public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 

*/
// --------- corrected code ---------
public class LoopVariableScope { 
 public static void main(String[] args) {
  int x=0; 
 for (int i = 0; i < 5; i++) { 
  x = i * 2; 
 } 
 System.out.println(x); 
 } 
} 

/*
   Q / Error to investigate: Why does the variable 'x' cause a compilation error? How does scope
   ans = Scope of the x variable is inside the for loop. you can initialize the x variable outside the for loop. 
*/