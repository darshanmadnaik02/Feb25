import java.util.*;
class Day{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day number: ");
		int num = sc.nextInt();
		switch(num){
			case 1:
				System.out.println("Monday");
				switch(num){
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.println("It is a weekday");
							break;
					case 6:
					case 7:
						System.out.println("It is a weekend");
							break;
				}
				break;
			case 2:
				System.out.println("Tuesday");
				switch(num){
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.println("It is a weekday");
							break;
					case 6:
					case 7:
						System.out.println("It is a weekend");
							break;
				}
				break;
			case 3:
				System.out.println("Wednesday");
				switch(num){
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.println("It is a weekday");
							break;
					case 6:
					case 7:
						System.out.println("It is a weekend");
							break;
				}
				break;
			case 4:
				System.out.println("Thursday");
				switch(num){
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.println("It is a weekday");
							break;
					case 6:
					case 7:
						System.out.println("It is a weekend");
							break;
				}
			case 5:
				System.out.println("Friday");
				switch(num){
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.println("It is a weekday");
							break;
					case 6:
					case 7:
						System.out.println("It is a weekend");
							break;
				}
				break;
			case 6:
				System.out.println("Saturday");
				switch(num){
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.println("It is a weekday");
							break;
					case 6:
					case 7:
						System.out.println("It is a weekend");
							break;
				}
				break;
			case 7:
				System.out.println("Sunday");
				switch(num){
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.println("It is a weekday");
							break;
					case 6:
					case 7:
						System.out.println("It is a weekend");
							break;
				}
				break;
			default:
				System.out.println("Enter valid number");
		}
		
		

	}
}