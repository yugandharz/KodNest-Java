public class nesteddowhile {
    public static void main(String[] args) {
        int i = 1;
        do { 
            int j = 1;
            do {
                System.out.println(i + "," +j);
                j++;
            }
            while (j<=5);
            i++;
        } 
        while (i<=5);
    

    }
}
