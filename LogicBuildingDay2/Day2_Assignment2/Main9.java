/*  ------- Given Code ----------

Snippet 10: 
public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
} 
*/

// -------- Corrected code ------

public class Main9 { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 Main9 m = new Main9();
 m.display(); 
 m.display(5); 
 } 
} 

/* Q What happens when you compile and run this code? Is method overloading allowed?
   ans = 
    What happens when you compile and run this code:
    Above code gives error:
    error: non-static method display() cannot be referenced from a static context
    Is method overloading allowed?:
    Yes, method overloading is allowed in Java
*/