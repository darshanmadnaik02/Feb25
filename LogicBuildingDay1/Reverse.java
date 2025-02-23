class Reverse{

      public static void main(String args[]){

      int a = 12345, k, res = 0,b = a;
      
      while(a>0){
          k = a % 10;
          res = res * 10 + k;
          a = a/10;
      }
      System.out.println("The reverse of "+b + " is " +res);
   }
}