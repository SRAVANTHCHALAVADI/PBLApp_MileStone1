class Calculator
{ 
    static int powerInt(int num1,int num2)
    {
        return (int)Math.pow(num1,num2);
    }
static double powerDouble(double num1,int num2)
{
    return Math.pow(num1,num2);
}
}
public class CalculatorDemo{

    public static void main(String[] args) {
    System.out.println(Calculators.powerInt(5,2));
    System.out.println(Calculators.powerDouble(5.2, 2));
    
    }

}