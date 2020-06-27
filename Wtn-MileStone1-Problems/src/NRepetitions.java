class NRepetitions{
public static void main(String [] args){
String s=args[0];
int l=Integer.parseInt(args[1]);

String res="";
for(int i=0;i<l;i++){
res+=s.substring(s.length()-l);
}
System.out.println(res);


}
}