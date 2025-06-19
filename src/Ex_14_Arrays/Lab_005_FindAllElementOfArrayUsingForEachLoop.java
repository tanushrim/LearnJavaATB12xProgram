package Ex_14_Arrays;

public class Lab_005_FindAllElementOfArrayUsingForEachLoop {
    public static void main(String[] args) {
        String [] Cars= {"Ferrari", "BMW", "Audi", "Lamborghini"};
        for (String i: Cars)//Syntax for For-Each loop= for(type variable:array name)
        {
            System.out.println(i);
        }
    }
}
