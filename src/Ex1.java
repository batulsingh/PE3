import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int numOfStudents;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students :");
        numOfStudents = sc.nextInt();

        int[] stuGrades = new int[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.print("Enter the marks of student " + (i + 1)+":");
            int temp = sc.nextInt();
            if (temp >= 0 && temp <= 100) {
                stuGrades[i] = temp;
            }
            else {
                System.out.println("Please enter marks between 0 and 100");
                i--;
            }
        }

    }
}