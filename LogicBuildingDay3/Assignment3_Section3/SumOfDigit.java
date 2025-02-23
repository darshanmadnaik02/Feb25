import java.util.*;
class SumOfDigit{
	public static void main(String[] args) {
	int k = 0,num = 9876,sum = 0;
	while(num>0){
		k = num % 10;
    		sum += k;
		num = num/10;
	}
	System.out.println("Sum of digit is: "+sum);
        
    }
}