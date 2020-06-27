class Encap{

private int a;
private String name;

void setName(String n){
name=n;
}
void setA(int b){
a=b;
}
int getA(){
return a;
}

String getName(){
return name;
}



}


class EncapDemo{
public static void main(String [] args){

Encap e=new Encap();
e.setA(606);
System.out.println("The value of a is : "+e.getA());
e.setName("Birthday girl anusha");
System.out.println("The value of name is : "+e.getName());


}
}