class RemoveLeftAndRightCharsOfStar{
public static void main(String [] args){

String s=args[0];
String res="";
for(int i=0;i<s.length();i++){
if(s.charAt(i)=='*'&&i!=0&&i!=s.length()-1){
res=s.substring(0,i-1)+s.substring(i+2);

}

}
if(s.charAt(0)=='*'&&s.length()>=2){
res=s.substring(2);

}
if(s.charAt(s.length()-1)=='*'){
res=s.substring(0,s.length()-2);
}

System.out.println(res);

}
}