package Ex_03_Java_Inc_Dec_Operator;

public class Lab_009_MultipleAddition {
    public static void main(String[] args) {
        int a = 11, b = 22, c;
        c = a + b + a++ + b++ + ++a + ++b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }
}
