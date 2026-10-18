public class placementReadPractice {
    public static void main(String[] args){
        int marks = 68;
        int attendence  = 80;
        int practiceDays = 3;

        String placement = (marks >= 60 && attendence >= 75)? "placement Ready " : "Continue Preparation";
        System.out.println(placement);
        for(int i = 0; i<3; i++){
            System.out.println("Practice day: " + i );
        }
    }
}