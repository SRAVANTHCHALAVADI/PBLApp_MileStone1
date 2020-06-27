class StaticDemo{
private static int a=0;
private int b;
public void set(int i,int j){

a=i;b=j;
}
public void show(){
System.out.println("The static a : "+a);
System.out.println("Non static b : "+b);
}
public static void main(String args[]){
StaticDemo x=new StaticDemo();
StaticDemo y=new StaticDemo();
x.set(347,190);
x.show();
y.set(1,1);
y.show();
x.show();
}
}
