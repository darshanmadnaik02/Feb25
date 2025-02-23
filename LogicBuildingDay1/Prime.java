class Prime{

      public static void main(String args[]){
      
      int a = 17, count = 0;
      for(int i=2;i<17;i++){
         if(a % i ==0){
            count++;
        }

     }
       if(count ==0){
            System.out.println("The number "+a+" is prime");
        }
       else{
           System.out.println("The number "+a+" is not prime");
     }
 }
}