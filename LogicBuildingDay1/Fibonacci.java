class Fibonacci{
      public static void main(String args[]){
        
      int i = 1,a = 0, b = 1,c;
      System.out.print(a+" "+b);
      while(i<=8){
          c = a + b;
          System.out.print(" "+c);
          a = b;
          b = c;
          i++;
       }
    }
      
}