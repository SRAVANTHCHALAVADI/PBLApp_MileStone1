import java.util.*;
class SearchElementInArray{
private static Scanner sc;

public static void main(String [] args){
sc = new Scanner(System.in);
System.out.println("enter array size : ");
int n=sc.nextInt(); 
int a[]=new int [n];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("enter  search element ");
int key=sc.nextInt();
int temp=0,flag=0;
for(int i=0;i<n;i++){
if(a[i]==key){
temp=i;
flag=1;
break;
}

}
if(flag==1){
System.out.println(temp);
}
else{
System.out.println("-1");
}

}
}