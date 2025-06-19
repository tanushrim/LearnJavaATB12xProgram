package Ex_14_Arrays;

public class Lab_013_GetAllMultidimentionalArrayUsingForEachLoop {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        for (int[] Num : numbers) {
            for (int num1 : Num) {
                System.out.println(num1);
            }
        }
    }
}
