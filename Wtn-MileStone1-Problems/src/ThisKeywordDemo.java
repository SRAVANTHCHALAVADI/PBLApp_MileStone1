class ThisKeyword{
private String name;
ThisKeyword(){
this("java");
System.out.println("Default Constructor : ");
}

ThisKeyword(String name){
this.name=name;
System.out.println("One Arg Constructor : "+name);
}
}

class ThisKeywordDemo{
public static void main(String [] args){
ThisKeyword t=new ThisKeyword();
ThisKeyword t1=new ThisKeyword("sravanth");

}
}