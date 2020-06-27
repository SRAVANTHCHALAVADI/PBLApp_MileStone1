import java.util.*;
class MinAndMax{
 private static Scanner sc;

public static void main(String args[]) {
        sc = new Scanner(System.in);
        int n=sc.nextInt();     //input size of array
      int []a=new int[n];           //declare array of desired size
      int max1=0,max2=-1,min1=0,min2=-1;        
      for(int i=0;i<n;i++)  
      {
          a[i]=sc.nextInt();            //scan array elements
      }
      for(int i=0;i<n;i++)
      {
          if(a[i]>a[max1])
          max1=i;
      }
      for(int i=0;i<n;i++)
      {
          if(max2==-1 && i!=max1)
          max2=i;
          else if(max2!=-1 && a[i]>a[max2] && i!=max1)
          max2=i;
      }
      for(int i=0;i<n;i++)
      {
          if(a[i]<a[min1])
          min1=i;
      }
      for(int i=0;i<n;i++)
      {
          if(min2==-1 && i!=min1)
          min2=i;
          else if(min2!=-1 && a[i]<a[min2] && i!=min1)
          min2=i;
      }
      System.out.println("max is "+a[max1]);
      System.out.println("max2 is "+a[max2]);
      System.out.println("min is "+a[min1]);
      System.out.println("min2 is "+a[min2]);
    }
}