public class CalculateInterest {
    public static void main (String[] args){
        double Principle = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;
        int[] marks = {78,84,69,91,88};
        int TotalMarks = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
        double SimpleInterest = Principle * rate * time / 100.0;
        double TotalAmount = Principle + SimpleInterest;
        double bmi = weight / (height * height);
        double percentage = (double) TotalMarks * 100.0 / 500;
        System.out.println("Simple Interest: " + SimpleInterest);
        System.out.println("Total Amount: " + TotalAmount);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Percentage: " + percentage);



    }

}