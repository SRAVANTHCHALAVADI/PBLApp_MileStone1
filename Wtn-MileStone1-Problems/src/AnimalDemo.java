class Animal{
void eat(){
System.out.println("Animal eats");
}
void sleep(){
System.out.println("Animal Sleeps");
}
}

class Bird extends Animal{
void eat(){
System.out.println("Bird eats");
}
void sleep(){
System.out.println("Bird Sleeps");
}
void fly(){
System.out.println("Bird Fly");
}


}
class AnimalDemo{
public static void main(String [] args){
Animal a=new Animal();
a.eat();
a.sleep();
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();


}
}