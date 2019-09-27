import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int arraySize;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of countries :");
        arraySize = sc.nextInt();
        sc.nextLine();

        String[] places = new String[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter name of country " + (i + 1) + " :");
            places[i] = sc.nextLine();
        }

        for (int i = 0; i < arraySize; i++) {
            places[i] = places[i].replaceAll("[AaEeIiOoUu]", "");
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Name of country " + (i + 1) + " without vowels : " + places[i]);
        }
    }
}