package Class_Tasks;

public class Lab_018_FindMaximumOfTwoNumbersUsingIfElseLoop {
    public static void main(String[] args) {
        int number1= 1;
        int number2=12;
        if(number1 > number2)
        {
            System.out.print ("Maximum number is:" + number1);
        }
        else if (number2>number1)
        {
            System.out.println("Maximum number is:" + number2);
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
    }
}

