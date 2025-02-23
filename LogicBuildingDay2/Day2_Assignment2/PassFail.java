import java.util.*;
class PassFail{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter subject1 mark: ");
	int sub1 = sc.nextInt();
	System.out.println("Enter subject2 mark: ");
	int sub2 = sc.nextInt();
	System.out.println("Enter subject3 mark: ");
	int sub3 = sc.nextInt();
	int count = 0;
	switch(sub1 > 40 ? 1 : 0){
		case 1:
		break;
		case 0:
		count++;
		break;
	}
	switch(sub2 > 40 ? 1 : 0){
		case 1:
		break;
		case 0:
		count++;
		break;
	}
	switch(sub3 > 40 ? 1 : 0){
		case 1:
		break;
		case 0:
		count++;
		break;
	}
	if(count == 0){
		System.out.println("Student pass in all subjects");
	}
	else{
		System.out.println("Student fail in "+count+" subjects");
	}
	}
}