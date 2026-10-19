import java.util.*;
public class arrayMutationTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] original = new int[n];
        for(int i = 0; i<n;i++){
            original[i] = scanner.nextInt();
        }
        int updatedIndex = scanner.nextInt();
        int UpdatedValue = scanner.nextInt();
        int[] duplicate = new int[n];
        for(int i = 0; i < n; i++){
            duplicate[i] = original[i];
        }
        int[] updatedOriginal = original;
        updatedOriginal[updatedIndex] = UpdatedValue;
        System.out.print("Original: ");
        for(int i = 0; i < n; i++){
            System.out.print(original[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Duplicate: ");
        for(int i = 0; i < n; i++){
            System.out.print(duplicate[i] + " ");
        }
        System.out.println(" ");
        scanner.close();
    }
}
