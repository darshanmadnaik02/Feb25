class Digits{
      public static void main(String args[]){ 
      int a = 123456, count = 0, b = a;
      while(a>0){
          a = a/10;
          count++;
      }
      System.out.println("The number "+b+ " has "+count+" digits");
   }
}