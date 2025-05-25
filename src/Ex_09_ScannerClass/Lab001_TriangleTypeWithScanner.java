package Ex_09_ScannerClass;
//Find the ype of triangle using Scanner class
import java.util.Scanner;

public class Lab001_TriangleTypeWithScanner {
    public static void main(String[] args) {

        Scanner TriangleTypeWithScanner = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int s1 = TriangleTypeWithScanner.nextInt();
        System.out.print("Enter second side: ");
        int s2 = TriangleTypeWithScanner.nextInt();
        System.out.print("Enter third side: ");
        int s3 = TriangleTypeWithScanner.nextInt();

        if (s1==s2 && s2==s3) {
            System.out.println("Equilateral triangle");
        }
        else if (s1==s2 || s2==s3 || s3==s1) {
            System.out.println("Isosceles triangle");
        }
            else
            {
                System.out.println("scalene triangle");
            }
        }
    }
