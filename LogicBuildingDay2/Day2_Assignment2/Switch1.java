/* -------Given code --------
Snippet 25: 
public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5");
        break; 
 case 5: 
 System.out.println("This is another case 5"); 
        break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 
*/
// ------- Corrected code --------
public class Switch1 { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5");
        break; 
 case 10: 
 System.out.println("This is another case 5"); 
        break; 
 default: 
 System.out.println("This is the default case"); 
 } 
 } 
} 
/* Q Error to Investigate: Why does the compiler complain about duplicate case labels? What 
    happens when you have two identical case labels in the same switch block? 
  ans = 
  error: duplicate case label
  In Switch case, duplicate case labels are not allowed because compiler can't determine which one to execute so each case label within a switch must be unique.
*/