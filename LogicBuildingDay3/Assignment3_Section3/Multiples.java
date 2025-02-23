class Multiples{
	public static void main(String args[]){
		int a = 7;
		System.out.println("Multiples of 7 between 1 and 100: ");
		for(int i =1;i<=100;i++){
			if(i % a ==0){
				System.out.print(i+" ");
			}
		}
	}
}