import java.util.*;
class SumAndAvg{
private static Scanner sc;

public static void main(String [] args){
sc = new Scanner(System.in);
int n=sc.nextInt();
int [] a=new int[n];
int sum=0;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
sum+=a[i];
}
System.out.println("Sum : "+sum);
System.out.println("Average : "+sum/a.length);

}
}