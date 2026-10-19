public class printMultiplicationTable {
    public static void main(String[] args) {
        int number = 5;

        for(int i = 0; i<= 10; i++){
            int total = number * i;
            System.out.println(number + " X " + i + " = " + total);
        }
    }
}
