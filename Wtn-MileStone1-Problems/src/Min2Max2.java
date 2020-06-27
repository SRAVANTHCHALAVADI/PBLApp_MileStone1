class Min2Max2{
public static void main(String [] args){
int i,min1,min2,max1,max2;
int [] a= {10,45,12,23,13,32,67};
min1=a[0];
max1=a[0];
for(i=0;i<a.length;i++){
if(a[i]>max1){
max1=a[i];
}
else if(a[i]<min1){
min1=a[i];
}
}

min2=max1;
max2=min1;

for(i=0;i<a.length;i++){
if(a[i]>max2 && a[i]<max1){
max2=a[i];
}
else if(a[i]<min2 && a[i]>min1){
min2=a[i];
}
}
System.out.println(min1+"  "+max1);
System.out.println(min2+"  "+max2);
}
}
