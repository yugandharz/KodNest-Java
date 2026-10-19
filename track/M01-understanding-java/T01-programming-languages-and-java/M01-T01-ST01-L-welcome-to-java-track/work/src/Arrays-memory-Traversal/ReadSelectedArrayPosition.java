import java.util.*;
public class ReadSelectedArrayPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int index = scanner.nextInt();
        System.out.println("Selected number: " + arr[index]);
    }
}
