class PrimrOrNotAdv{
public static void main(String [] args){
if(args.length == 0)
    {
        System.out.println("Please enter an integer number.");
        System.exit(0);
    }
int a=Integer.parseInt(args[0]);
int flag=0;

if(a==1||a==0){
System.out.println(a+" is neither prime nor composite");
}
else{
	for(int i=1;i<a;i++){
		if(a%i==0){
			flag+=1;
		}

	}
	if(flag==1){
		System.out.println(a+ " is a Prime Number");
	}
	else{ 
		System.out.println(a +" is Not Prime a Number");
	}
}

}
}