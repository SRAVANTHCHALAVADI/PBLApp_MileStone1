class PrimrOrNot{
public static void main(String [] args){
int a=Integer.parseInt(args[0]);
int flag=0;
for(int i=1;i<Math.sqrt(a);i++){
if(a%i==0){
flag++;
}

}
System.out.println(flag +"  Sample Prime");
if(flag==1){
System.out.println("Prime");
}
else{
System.out.println("Not Prime");
}
}
}