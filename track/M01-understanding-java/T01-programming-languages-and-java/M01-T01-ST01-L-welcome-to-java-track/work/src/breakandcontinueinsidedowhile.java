public class breakandcontinueinsidedowhile {
    public static void main(String[] args) {
        int i = 0;
        do { 
            if(i == 3){
                i++;
                continue;
            }
            if(i == 7){
                break;
            }
            System.out.println(i);
            i++; 
        }
        while(i< 10);
    }
}
    