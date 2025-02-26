import java.util.*;

public class Array_as_function_argument {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) { // Fixed index out of bounds issue
            marks[i] = marks[i] + 1;
            System.out.println(marks[i]);
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[3]; // Array should have a fixed size as per input
        Scanner sc = new Scanner(System.in);

        // Taking input
        marks[0] = sc.nextInt(); // Example: OOPS
        marks[1] = sc.nextInt(); // Example: Big Data
        marks[2] = sc.nextInt();

        // Calling update function
        update(marks);
        for (int i = 0; i < marks.length; i++) { // Fixed index out of bounds issue;
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
