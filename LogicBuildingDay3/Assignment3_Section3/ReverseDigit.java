class ReverseDigit{
	public static void main(String args[]){
		int num=1234,k=0,r = 0,a = num;

		while(num>0){
			k = num % 10;
			r = r * 10 + k;
			num = num/10; 
		}
		System.out.println("Reverse of "+a+" is "+r);
	}
}