public class breakinsidewhileloop {
    public static void main(String[] args) {
        int i = 0;
        while(i< 15){
            if(i == 7){
                i++;
                continue;
            }
            if(i == 13){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}