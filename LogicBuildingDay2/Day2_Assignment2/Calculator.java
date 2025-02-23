import java.util.*;
class Calculator{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operator");
		String operator = sc.nextLine();
		System.out.println("Enter Two Number");
		double a = sc.nextDouble();
		int b = sc.nextInt();
		
		switch(operator){
			case "+":
				System.out.println(a + b);
				break;
			case "-":
				System.out.println(a - b);
				break;
			case "*":
				System.out.println(a * b);
				break;
			case "/":
				switch(b){
					case 0:
						System.out.println("Error");
						break;
				}
				System.out.println(a / b);
				break;
			default:
				System.out.println("Enter valid number");
				break;
		}
	}
	

}