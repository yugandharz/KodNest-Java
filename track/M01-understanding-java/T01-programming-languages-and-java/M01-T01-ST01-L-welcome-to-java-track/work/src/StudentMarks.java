public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 95, 88};
        int totalmarks = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        double Percentage = (totalmarks/500.0) * 100; 
        boolean vaild = (marks[0] >= 0 && marks[0] <=100) &&
                        (marks[1] >= 0 && marks[1] <=100) &&
                        (marks[2] >= 0 && marks[2] <=100) &&
                        (marks[3] >= 0 && marks[3] <=100) &&
                        (marks[4] >= 0 && marks[4] <=100);
        
        String result = Percentage < 40 ? "fail" : Percentage < 60? "pass" : Percentage < 75? "first class" : "Distinction";
        String Scholarship = (Percentage >= 85 && marks[0] >= 75 && marks[1] >=75 && marks[2] >= 75 && marks[3] >= 75 && marks[4] >= 75 )? "eligible" : "not eligible";
        System.out.println("Percentage: " + Percentage);
        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Vaild Marks: " + vaild);
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + Scholarship);
    }
}