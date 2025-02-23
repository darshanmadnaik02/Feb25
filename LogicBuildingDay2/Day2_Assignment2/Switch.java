/* -------Given code --------
Snippet 25: 
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
*/
// ------- Corrected code --------
public class Switch { 
 public static void main(String[] args) { 
 int score = 85; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
/* Q Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work?
  ans = 
  Switch statements in Java do not support double and float data type.
  Switch statements support int, char, byte, short, String. 
*/