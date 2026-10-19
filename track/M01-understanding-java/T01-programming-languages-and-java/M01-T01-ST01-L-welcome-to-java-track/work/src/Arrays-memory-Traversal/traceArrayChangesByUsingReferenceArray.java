import java.util.*;
public class traceArrayChangesByUsingReferenceArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Define the array length
        int n = scanner.nextInt();
        // populating the values to array
        int[] original = new int[n];
        for(int i = 0; i < n; i++){
            original[i] = scanner.nextInt();
        }
        //populating updated index and values and requested values
        int updatedIndex = scanner.nextInt();
        int updatedValue = scanner.nextInt();
        int requestIndex = scanner.nextInt();
        //copy the original array values into snapshot array
        int[] snapshot = new int[original.length];
        for(int i = 0; i< n; i++){
            snapshot[i] = original[i];
        }
        //update values through duplicate array by updated values and in index
        int[] duplicates = original;
        duplicates[updatedIndex] = updatedValue;
        //Display original snapshot and duplicates
        System.out.print("Original: ");
        for(int i = 0; i<n; i++){
            System.out.print(original[i] + " , ");
        }
        System.out.println(" ");
        System.out.print("Snapshot: ");
        for(int i = 0; i< n ; i++){
            System.out.print(snapshot[i] + " , ");
        }
        System.out.println(" ");
        System.out.print("Duplicate: ");
        for(int i = 0 ; i < n; i++){
            System.out.print(duplicates[i] + " , ");
        }
        System.out.println(" ");
        //validate requested index is correct or wrong
        if(requestIndex >0 && requestIndex < n){
            System.out.println("Requested value: Valid Index" );
             System.out.println("requested Value: " + original[requestIndex]);
        } else {
            System.out.println("Requested value: Invalid Index");
        }
    }
}
