import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] numbers = input.split(",");

        int size = numbers.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }

        boolean result = true;
        for (int i = 0; i < size - 1; i++) {
            if ((arr[i + 1] - arr[i]) == 1) {
            }
            else if((arr[i] - arr[i+1]) == 1) {
            }
            else
             {
                result = false;
                break;
            }
        }
        if(result)
            System.out.println(input + " are consecutive numbers");
        else
            System.out.println(input + " are non consecutive numbers");
    }
}
