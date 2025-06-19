package Ex_16_OOPs;

public class Lab_003_CreateMultipleObject {
    int mynum= 13;

    public static void main(String[] args) {
        Lab_003_CreateMultipleObject num1= new Lab_003_CreateMultipleObject();
        Lab_003_CreateMultipleObject num2= new Lab_003_CreateMultipleObject();
        Lab_003_CreateMultipleObject num3= new Lab_003_CreateMultipleObject();
        System.out.println(num1.mynum);
        System.out.println(num2.mynum);
        System.out.println(num3.mynum);
    }


}
