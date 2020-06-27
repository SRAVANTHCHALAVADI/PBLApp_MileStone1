class Bitwise{
public static void main(String [] args){
int x=7,y=9;
int z=x&y;
System.out.println("x&y : "+z);
x=5;y=9;
z=x|y;
System.out.println("x|y : "+z);
z=x^y;
System.out.println("x^y : "+z);
System.out.println("bool: "+(x<y));
}
}