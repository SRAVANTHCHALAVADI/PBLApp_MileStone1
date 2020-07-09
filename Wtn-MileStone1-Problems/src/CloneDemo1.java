class ABC{
int c;
int d;
}

class XYZ implements Cloneable{
int a;
double b;
ABC ab=new ABC();

XYZ cloneTest(){
try{
XYZ x= (XYZ)super.clone();
x.ab=new ABC();
return x;
}catch(CloneNotSupportedException e){
System.out.println("Clone Not Allowed");
return this;
}
}
}

public class CloneDemo1 {
	public static void main(String [] args){
		XYZ x1=new XYZ();
		XYZ x2;
		x1.a=10;
		x1.b=20;
		x1.ab.c=30;
		x1.ab.d=40;
		x2=x1.cloneTest();
		x2.ab.c=1000;
		x2.ab.d=2000;
		System.out.println("x1 : "+x1.a+" - "+x1.b);
		System.out.println("x2 : "+x2.a+" - "+x2.b);
		System.out.println("x1.ab : "+x1.ab.c+" - "+x1.ab.d);
		System.out.println("x2.ab : "+x2.ab.c+" - "+x2.ab.d);

		x1.a=100;
		x1.b=200;
		x1.ab.c=300;
		x1.ab.d=400;
		System.out.println("x1 : "+x1.a+" - "+x1.b);
		System.out.println("x2 : "+x2.a+" - "+x2.b);
		System.out.println("x1.ab : "+x1.ab.c+" - "+x1.ab.d);
		System.out.println("x2.ab : "+x2.ab.c+" - "+x2.ab.d);

		}

}
