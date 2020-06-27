class NumofTimesADigitOccurs{
public static void main(String [] args){
int a[] =new int [] {23,45,67,89,21};
int b[] =new int [] {0,0,0,0,0,0,0,0,0,0};

for(int i=0;i<a.length;i++){
while(a[i]!=0){
int temp=a[i]%10;
b[temp]++;
a[i]=a[i]/10;
}


}
for(int i=0;i<b.length;i++){
System.out.println(i+" --> "+b[i]);
}
int max=0,c=0;
for(int i=0;i<b.length;i++){
if(b[i]>max){
max=b[i];
c=i;
}


}
System.out.println("Max Occured Digit : "+c);
}
}


/*write a program to read n number of elements in the array. find out how many num of times each digit occrs in total number of elements*/ 