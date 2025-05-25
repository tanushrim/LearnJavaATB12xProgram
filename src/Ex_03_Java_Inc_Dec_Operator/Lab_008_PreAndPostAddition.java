package Ex_03_Java_Inc_Dec_Operator;

public class Lab_008_PreAndPostAddition {
    public static void main(String[] args) {
        int i = 11;
        i = i++ + ++i;
        System.out.println(i);
    }
}
