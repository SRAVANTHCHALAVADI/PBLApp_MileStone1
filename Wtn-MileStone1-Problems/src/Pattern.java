class Pattern{
public static void main(String [] args){
int n=Integer.parseInt(args[0]);
int i,j;
for(i=0;i<n;i++){

for(j=n-i;j>0;j--){
System.out.print(" ");
}
for(j=0;j<=i;j++){

System.out.print(n-j);

}
System.out.println("");
}



}
}