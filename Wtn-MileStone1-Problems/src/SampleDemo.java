class SampleConstructor{
private int id;
SampleConstructor(){
id=30190;
System.out.println("Default  id : "+id);
}

SampleConstructor(int no){
id=no;
System.out.println("One Arg  id : "+id);
}

}

class SampleDemo
{

public static void main(String [] args){

SampleConstructor s1=new SampleConstructor();
SampleConstructor s2= new SampleConstructor(190);
}
}