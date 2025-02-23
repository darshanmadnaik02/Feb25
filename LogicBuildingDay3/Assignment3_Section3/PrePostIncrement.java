class PrePostIncrement{
	public static void main(String args[]){
		int a = 10;
                int result = a++ + ++a + a-- + --a;
		System.out.println(result);
	}
}