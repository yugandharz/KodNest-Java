import java.util.*;
public class CreateAndFillTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i =0; i<3; i++){
            numbers[i] = scanner.nextInt();
        }
        for(int i = 0; i < 3; i++){
            System.out.print(numbers[i] + " ");
        }
        scanner.close();
    }
}
