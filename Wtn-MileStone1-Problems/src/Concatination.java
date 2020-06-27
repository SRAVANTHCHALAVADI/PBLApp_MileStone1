class Concatination{
static String conc(String a,String b){
String res;
if(a.charAt(a.length()-1)==b.charAt(0)){
res=a+b.substring(1);
}
else{
res=a+b;
}
return res;
}

public static void main(String [] args){

String res=conc(args[0].toLowerCase(),args[1].toLowerCase());
System.out.println(res);
}
}