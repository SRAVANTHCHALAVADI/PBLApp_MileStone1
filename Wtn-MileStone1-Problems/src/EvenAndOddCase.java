class EvenAndOddCase{
public static void main(String [] args){
String s=args[0];
String res="";
for(int i=0;i<s.length();i++){
if(i%2==0){
res+=Character.toUpperCase(s.charAt(i));
}
else{
res+=Character.toLowerCase(s.charAt(i));
}

}
System.out.println(res);

}
}