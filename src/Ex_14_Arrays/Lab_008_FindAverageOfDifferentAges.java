package Ex_14_Arrays;

public class Lab_008_FindAverageOfDifferentAges {
    public static void main(String[] args) {
        int Age[]= {24, 12, 34, 35, 60};
        float avg, sum = 0;

        // Get the length of the array
        int length = Age.length;

        // Loop through the elements of the array
        for (int age : Age) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);
    }
}

