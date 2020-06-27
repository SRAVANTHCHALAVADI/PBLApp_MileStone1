class Fruit{
String name="fruit";
String taste="sweet";
int size=100;
void eat(){
System.out.println("its name is "+name+" and tastes "+taste+" and having size "+size+".");

}
}

class Apple extends Fruit{
String name="Apple";
String taste="Sugary";
int size=120;
void eat(){
System.out.println("its name is "+name+" and tastes "+taste+" and having size "+size+".");

}
}

class Orange extends Fruit{
String name="Orange";
String taste="Juicy";
int size=140;
void eat(){
System.out.println("its name is "+name+" and tastes "+taste+" and having size "+size+".");

}
}

class FruitDemo{
public static void main(String [] args){
Fruit f=new Fruit();
f.eat();
Apple a=new Apple();
a.eat();
Orange o=new Orange();
o.eat();



}
}





