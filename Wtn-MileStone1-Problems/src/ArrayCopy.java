class ArrayCopy{
public static void main(String [] args){

int src[]={10,20,300};

int dest[]=new int[3];
System.arraycopy(src,0,dest,0,src.length);

for(int i=0;i<dest.length;i++){
System.out.println("Element at index "+i+" "+dest[i] );
}
}
}