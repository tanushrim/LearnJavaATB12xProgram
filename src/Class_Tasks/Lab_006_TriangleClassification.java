package Class_Tasks;
//Find out the type of triangle
public class Lab_006_TriangleClassification {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=4;
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid triangle: Side lengths must be positive.");

        } else if (!((a + b > c) && (a + c > b) && (b + c > a))) {
            System.out.println("Invalid triangle: Side lengths do not satisfy triangle inequality.");
        }
        else if (a==b && b==c)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (a==b || b==c || c==a)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Scalene triangle");
        }

    }
}
