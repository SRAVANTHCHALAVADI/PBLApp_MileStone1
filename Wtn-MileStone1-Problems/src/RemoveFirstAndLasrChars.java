class RemoveFirstAndLasrChars{
public static void main(String [] args){

String s=args[0];
if(s.length()>2){
System.out.println(s.substring(1,s.length()-1));
}
else{
System.out.println("null");
}


}
}