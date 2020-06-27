class PublicDefaultPrivate{
private int a=190;
public int b=347;
int c=440;
public int getA(){
return a;
}

public void setA(int a){
this.a=a;
}

}

public class PublicDefaultPrivateDemo{
public static void main(String [] args){
PublicDefaultPrivate p=new PublicDefaultPrivate();
System.out.println(p.getA());
System.out.println(p.b);
System.out.println(p.c);

}
}