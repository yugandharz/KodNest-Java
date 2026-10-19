import java.util.*;
public class storeThreemarksandPrintSecondValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for(int i = 0; i< 3; i++){
            numbers[i] = scanner.nextInt();
        }    
            System.out.println(numbers[1]);
            scanner.close();
        
    }
}
