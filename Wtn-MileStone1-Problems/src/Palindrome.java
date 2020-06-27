class Palindrome{
public static void main(String [] args){
int c=0;
for(int i=0;i<=(args[0].length()-1);i++){
if(args[0].charAt(i)==args[0].charAt(args[0].length()-1-i)){
c++;
}

}
if(c==args[0].length()){

System.out.println(args[0]+" is a palindrome Number");
}
else{
System.out.println(args[0]+" is not a palindrome Number");

}

}
}