import java.util.*;
public class printFirstAndLastValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("first value: " + arr[0] +" , " +  "Last value: " + arr[n-1]);
    }
}
