import java.util.*;
public class updateValuesByAddingValues {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] values = new int[size];
    for(int i = 0; i < values.length; i++){
        values[i] = scanner.nextInt();
    }
    int bonus = scanner.nextInt();
    for(int i=0; i<size;i++){
        values[i] += bonus;
    }
    System.out.print("Updated Values: ");
    for(int i = 0; i< size; i++){
        System.out.print(values[i] + " ");
    }
}
}
