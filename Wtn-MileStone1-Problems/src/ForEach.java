class ForEach{
public static void main(String [] args){

for(String i:args){
System.out.print(i);
if(i.equals(args[args.length-1])){
break;
}
System.out.print(",");
}

}
}