/* ----------- Given code --------
Snippet 11: 
public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
}
*/
// --------- corrected code ---------
public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 1;  
 } 
 } 
}

/*
   Q Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the desired result?
   ans = The given code will print unexpected results because the loop variable i is updated by 2 in each iteration. The loop should increment i by 1 instead of 2. 
*/