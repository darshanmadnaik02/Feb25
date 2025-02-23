class LargestNumber{
    
      public static void main(String args[]){
      int a = 12;
      int b = 45;
      int c = 22;
      if(a>b){
         if(a>c){
            System.out.println("The largest number is "+a);
         }
         else{
            System.out.println("The largest number is "+c);
         }
      }
         else{
             if(b>c){ 
                System.out.println("The largest number is "+b);
            }
             else{
                 System.out.println("The largest number is "+c);
            }
            
        }
   }
     
}