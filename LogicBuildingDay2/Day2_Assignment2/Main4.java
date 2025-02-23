/* --------------  Given Code ------------

Snippet 5:

public class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 
*/
// ------------ Corrected code ----------

public class Main4 { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 }  
} 


/* Q Can you have multiple main methods? What do you observe?
   ans. =  Yes, you can have multiple main methods different parameter lists. Only the public static void main(String[] args) method is executed because it is entry point for java program.
*/
    
