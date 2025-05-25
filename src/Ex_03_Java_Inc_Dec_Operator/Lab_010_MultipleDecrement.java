package Ex_03_Java_Inc_Dec_Operator;

public class Lab_010_MultipleDecrement {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;
        int m = i-- - j-- - k--;
        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
    }
}
