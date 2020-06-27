class AddDigitsInANumber{
public static void main(String [] args){
int a=Integer.parseInt(args[0]);
int sum=0;
int rem,temp=a;
for(int i=0;i<args[0].length();i++){
rem=a%10;
sum+=rem;
a=a/10;

}
System.out.println(temp+" -> "+sum);

}
}