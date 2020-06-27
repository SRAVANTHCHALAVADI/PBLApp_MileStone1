class AsciiValuesThroughArray{
public static void main(String [] args){
int a[]=new int[58];
for(int i=65;i<123;i++){
a[i-65]=i;
System.out.print((char)a[i-65]+" ");
}


}
}