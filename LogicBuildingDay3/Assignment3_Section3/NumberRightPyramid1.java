class NumberRightPyramid1{
	public static void main(String args[]){
		int n =5;
		for(int i =1;i<=n;i++){
			int m = n;
			for (int j=1;j<=i;j++) {
                		System.out.print(m+" ");
				m--;
            		}
		System.out.println();
		}
		
		
	}
}