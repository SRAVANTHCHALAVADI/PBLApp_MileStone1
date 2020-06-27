class Test{
public static void main(String [] args){
//int for=2;
//byte  b= 128;
int x=10,y=5;
System.out.println("java Tested : "+args.length+"   " );
System.out.println("++x+(++y) : "+ (++x+(++y)));

int x1=5;
if(x1<20){
System.out.println("This is a IF Blcok");
}

int age;
age=Integer.parseInt(args[0]);
if(age>18){
System.out.println("Eligible to vote");
}
else{
System.out.println("Not Eligible");
}


int month=Integer.parseInt(args[1]);
if(month==12 || month==1 || month==2){
System.out.println("Winter");
}
else if(month==3 || month==4 || month==5){
System.out.println("Spring");
}
else if(month==6 || month==7 || month==8){
System.out.println("Summer");
}
else if(month==9 || month==10 || month==11){
System.out.println("Autumn");
}
else{
System.out.println("Invalid Month");
}




int wd =Integer.parseInt(args[2]);
switch(wd){
case 1 : System.out.println("Sunday");break;
case 2 : System.out.println("Sunday");break;
case 3 : System.out.println("Sunday");break;
case 4 : System.out.println("Sunday");break;
case 5 : System.out.println("Sunday");break;
case 6 : System.out.println("Sunday");break;
case 7 : System.out.println("Sunday");break;
default : System.out.println("Invalid Day");
}


}
}