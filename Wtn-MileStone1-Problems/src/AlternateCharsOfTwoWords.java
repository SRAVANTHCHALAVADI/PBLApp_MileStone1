class AlternateCharsOfTwoWords{
public static void main(String [] args){
String s1=args[0];
String s2=args[1];
String res="";
if(s1.length()>s2.length()){
for(int i=0;i<s2.length();i++){
res+=(s1.charAt(i)+""+s2.charAt(i))+"";

}
res+=s1.substring(s2.length());

}

if(s1.length()<=s2.length()){
for(int i=0;i<s1.length();i++){
res+=(s1.charAt(i)+""+s2.charAt(i))+"";

}
res+=s2.substring(s1.length());

}
System.out.println(res);


}
}