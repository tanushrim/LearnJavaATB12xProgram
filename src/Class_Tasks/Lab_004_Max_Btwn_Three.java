package Class_Tasks;

public class Lab_004_Max_Btwn_Three {
    public static void main(String[] args) {
        int n1=1;
        int n2=2;
        int n3=3;
        int max = (n1>n2) ? (n1>n3) ? n1: n3:((n2>n3) ? n2:n3);
        System.out.println(max);

    }
}
