import java.util.*;
class LastDigitsAreSame{
private static Scanner sc;

public static void main(String [] args){
sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(Math.abs(a)%10==Math.abs(b)%10){
System.out.println("True");
}
else{
System.out.println("False");
}
}
}