class Box{
double width;
double height;
double depth;
Box(double width,double height,double depth){
this.width=width;
this.height=height;
this.depth=depth;

}

double volume (){
return (width*height*depth);
}


}

class BoxDemo{
public static void main(String [] args){
Box b=new Box(2.2,3.3,4.4);
System.out.println(b.volume());

}
}