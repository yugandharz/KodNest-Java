import java.util.*;
public class StudentResultReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        for(int i = 0; i<5; i++){
            System.out.println("Enter " + i + " Subject Marks: ");
            marks[i] = scanner.nextInt();
        }
        int total = 0;
        for(int i = 0; i < 5; i++){
            total += marks[i];
        }
        double average = (double) total /5;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
