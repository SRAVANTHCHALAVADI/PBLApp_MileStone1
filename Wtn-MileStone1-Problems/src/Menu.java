import java.util.*;
class Menu{
private static Scanner sc;
private static Scanner sc2;

static void fun(){
System.out.println("1 --> Add\n2 --> Sub");
int x,y;
sc = new Scanner(System.in);
int a=sc.nextInt();
switch(a){
case 1 : System.out.println("Enter x number : ");
	  x=sc.nextInt();
	  System.out.println("Enter y number : ");	  		  y=sc.nextInt();
          System.out.println("Add " +(x+y));break;
case 2 : System.out.println("Enter x number : ");
	  x=sc.nextInt();
	  System.out.println("Enter y number : ");	  		  y=sc.nextInt();
          System.out.println("Sub " +(x-y));break;
default : System.out.println("Type the menu numbers ");

}

}

public static void main(String [] args){
sc2 = new Scanner(System.in);
fun();
while(true){
System.out.println("Do you Want to Continue type \"yes\"");
if(sc2.next().equals("yes")){ 
fun();
}else{break;}
}

}
}