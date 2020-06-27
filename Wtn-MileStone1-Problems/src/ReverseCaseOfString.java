class ReverseCaseOfString{
public static void main(String [] args){
String s="MaDAm";
String res="";
for(int i=0;i<s.length();i++){
if(Character.isLowerCase(s.charAt(i))){

res+=Character.toUpperCase(s.charAt(i));//can also do by asci values
System.out.println(res);
}
else if(Character.isUpperCase(s.charAt(i))){
res+=Character.toLowerCase(s.charAt(i));
}

}
System.out.println("Reversed String : "+res);
}
}