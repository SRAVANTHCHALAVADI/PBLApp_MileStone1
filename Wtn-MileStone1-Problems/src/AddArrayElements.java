import java.util.*;
class AddArrayElements{
private static Scanner sc;

public static void main(String [] args){
int a[] =new int [8];
int b[] =new int [8];
sc = new Scanner(System.in);
for(int i=0;i<8;i++){
	
int n=sc.nextInt();
if(n>100 && n<999){
a[i]=n;
}else{
System.out.println("Enter values between 100 and 999");
a[i]=sc.nextInt();	
}

}
int sum,rem;
for(int i=0;i<a.length;i++){
sum=0;
while(a[i]>0){
rem=a[i]%10;
sum+=rem;
a[i]/=10;
}
b[i]=sum;

}
int max=0,c=0;
for(int i=0;i<b.length;i++){
if(b[i]>max){
max=b[i];
c=i;
}

}

System.out.println("a["+c+"] value is"+b[c]);
}
}