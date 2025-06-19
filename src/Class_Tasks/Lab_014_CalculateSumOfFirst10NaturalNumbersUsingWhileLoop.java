package Class_Tasks;

public class Lab_014_CalculateSumOfFirst10NaturalNumbersUsingWhileLoop {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while (i<=10)
        {
            sum+=i;
            i++;
        }
        System.out.println("The sum of first 10 natural number is = " + sum);
    }
}
