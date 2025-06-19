package Class_Tasks;

public class Lab_009_PrintSumOfFirst10NaturalNumbers {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=10; i++) {
            sum = sum + i;
        }
            System.out.println("Sum of first 10 natural numbers is: " + sum);
    }
}
