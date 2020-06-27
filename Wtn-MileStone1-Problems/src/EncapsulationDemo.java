class Encapsulation{

private int x;
private int y;
public void setX(int x){
this.x=(x>79 ? 79 : (x<0 ?0 : x));
}

public void setY(int y){
this.y=(y>24 ? 24 : (y<0 ?0 : y));
}

public int getX(){

return x;
}

public int getY(){

return y;
}

}

class EncapsulationDemo{
public static void main(String [] args){
int a,b;
Encapsulation e=new Encapsulation();
e.setX(22);
e.setY(44);
a=e.getX();
System.out.println("The value fo a is : "+a);
b=e.getY();
System.out.println("The value fo b is : "+b);
}
}