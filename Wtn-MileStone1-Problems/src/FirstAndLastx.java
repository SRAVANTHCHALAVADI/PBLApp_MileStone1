class FirstAndLastx{

static String hasX(String s){
if(s.length()>=2 &&(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x')){

return s.substring(1,s.length()-1);
}
if(s.charAt(0)=='x'&&s.charAt(s.length()-1)!='x'){
return s.substring(1);
}
if(s.charAt(0)!='x'&&s.charAt(s.length()-1)=='x'){
return s.substring(0,s.length()-1);
}
return s;
}

public static void main(String [] args){

String s1=args[0];
System.out.println(hasX(s1));

}
}
