class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       String  primeNumbers = "";

       for (i = 11; i <= 99; i++)         
       { 		  	  
          int flag=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		flag = flag + 1;
	     }
	  }
	  if (flag ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 10 to 99 are :");
       System.out.println(primeNumbers);
   }
}