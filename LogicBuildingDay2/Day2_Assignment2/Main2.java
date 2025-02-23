/* ------------- Given code ----------

Snippet 3: 
public class Main { 
 public static int main(String[] args) {    // Error is main method return int
 System.out.println("Hello, World!"); 
 return 0; 
 }
 
 Error is curly brackets is missing

*/
// ---------- Corrected Code ------------
public class Main2 { 
 public static void main(String[] args) { // main method must return void
 System.out.println("Hello, World!");
 }
}   