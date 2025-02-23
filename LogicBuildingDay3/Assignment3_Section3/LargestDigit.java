import java.util.*;
class LargestDigit{
	public static void main(String[] args) {
	int k = 0,num = 4825,sum = 0,l = 0,a = num;
	while(num>0){
		k = num % 10;
    		if(k > l){
			l = k;
		}
		num = num/10;
	}
	System.out.println("Largest digit in the number "+a+" is: "+l);
        
    }
}