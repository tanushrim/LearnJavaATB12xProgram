package Class_Tasks;
//Find out the type of triangle
public class Lab_006_TriangleClassification {
    public static void main(String[] args) {
        int a=5;
        int b=5;
        int c=5;
        if (a==b && b==c)
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
