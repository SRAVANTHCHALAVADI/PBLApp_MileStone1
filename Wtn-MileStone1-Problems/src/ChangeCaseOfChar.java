import java.util.*;
class ChangeCaseOfChar{
private static Scanner sc;

public static void main(String [] args){
sc = new Scanner(System.in);
char c=sc.next().charAt(0);
if(Character.isLowerCase(c)){
System.out.println(c+" -> "+Character.toUpperCase(c));
}
if(Character.isUpperCase(c)){
System.out.println(c+" -> "+Character.toLowerCase(c));
}

}
}

