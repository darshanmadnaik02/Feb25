import java.util.*;

class DiscountCalc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a membership card? (yes/no)");
        String membership_Card = sc.nextLine().toLowerCase();  
        System.out.println("Enter purchase amount:");
        int amount = sc.nextInt();
        
        double discount = 0.0, final_amount = 0.0;
        
        if (amount >= 1000) {
            discount = amount * 0.20;
            if (membership_Card.equals("yes")) {
                discount += amount * 0.05;
            }
        } else if (amount >= 500 && amount <= 999) {
            discount = amount * 0.10;
            if (membership_Card.equals("yes")) {
                discount += amount * 0.05;
            }
        } else {
            discount = amount * 0.05;
            if (membership_Card.equals("yes")) {
                discount += amount * 0.05;
            }
        }
        
        final_amount = amount - discount;
        System.out.println("Final amount after discount: " + final_amount);
    }
}
