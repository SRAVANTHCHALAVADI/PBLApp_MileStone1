class Intrest{
public static void main(String [] args){
String gen=args[0];
int age=Integer.parseInt(args[1]);
if(gen.equals("female")&&(age>=1&&age<=58))
{
	System.out.println("Intrest : 8.2%");
	}
if(gen.equals("female")&&(age>=59&&age<=120)){
	System.out.println("Intrest : 7.6%");
	}

if(gen.equals("male")&&(age>=1&&age<=60)){
		System.out.println("Intrest : 9.2%");
	}
if(gen.equals("male")&&(age>=61&&age<=120)){
		System.out.println("Intrest : 8.3%");
	}

}
}