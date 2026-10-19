import java.util.*;
public class InventoryReorderPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items: ");
        int size = scanner.nextInt();
        int[] orders = new int[size];
        for(int i = 0; i < size; i++){
            System.out.println("Stock of " + i+ " item: ");
            orders[i] = scanner.nextInt();
        }
        System.out.println("Average level of Stocks: ");
        int reOrderLevel = scanner.nextInt();
        int res = 0;
        for(int result : orders){
            if(result < reOrderLevel){
                res += 1;
            }
        }
        System.out.println("Reorder items number: " + res);
    }
}
