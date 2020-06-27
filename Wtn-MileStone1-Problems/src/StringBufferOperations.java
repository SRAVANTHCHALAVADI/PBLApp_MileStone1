/*this is white -->(append board )this is white borard and make change like whte should b replaced with black */

class StringBufferOperations{
public static void main(String [] args){
StringBuffer s=new StringBuffer("This is White");
s.append(" board");
System.out.println("After appending : "+s);
s.delete(8,13);
System.out.println("after delete : "+s);
s.insert(8,"black");
System.out.println("after insert : "+s);
s.replace(8,13,"green");
System.out.println("after replacing : "+s);


}
}