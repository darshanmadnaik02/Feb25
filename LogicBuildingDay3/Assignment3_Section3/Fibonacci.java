class Fibonacci{
	public static void main(String args[]){
		int i=0,a = 0, b = 1, c=0;
		System.out.print(a + " "+b+" ");
		while(i<19){
			c = a + b;
                        System.out.print(c+" ");
			a = b;
			b = c;
			i++; 
		}
		
	}
}