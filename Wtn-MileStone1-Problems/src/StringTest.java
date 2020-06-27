class StringTest{
public static void main(String [] args){
String s1="Hello";
String s2="Hello";
String s3=new String("hi");
String s4=new String("hi");
if(s1==s2){
System.out.println("String Objects referencd are same");
}
else{
System.out.println("String Objects referencd are Not  same");

}
if(s3==s4){
System.out.println("String Objects referencd are same");
}
else{
System.out.println("String Objects referencd are Not  same");

}

}
}