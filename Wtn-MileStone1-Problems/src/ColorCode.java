
class ColorCode{
public static void main(String [] args){

char c=args[0].charAt(0);
if(Character.isLowerCase(c)){
c=Character.toUpperCase(c);
}
switch(c){
case 'R' : System.out.println(c+" -> Red");break;
case 'B' : System.out.println(c+" -> Blue");break;
case 'G' : System.out.println(c+" -> Green");break;
case 'O' : System.out.println(c+" -> Orange");break;
case 'Y' : System.out.println(c+" -> Yellow");break;
case 'W' : System.out.println(c+" -> White");break;
default : System.out.println("Invalid Code");

}
}
}