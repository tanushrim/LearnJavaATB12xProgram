package Ex_14_Arrays;

public class Lab_009_FindLowestOfDifferentAges {
    public static void main(String[] args) {
        int Ages[]= {1,2,3,3,5};

        //get the length of an array
        int length = Ages.length;

        //Create a lowestAge variable and assign to the first array element
        int lowestAge= Ages[0];

        //Loop through element
        for (int age: Ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is: " +lowestAge);
            }
        }


