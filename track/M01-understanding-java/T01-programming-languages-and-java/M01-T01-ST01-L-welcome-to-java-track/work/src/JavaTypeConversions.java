public class JavaTypeConversions {
    public static void main(String[] args) {
        int completedProblems = 27;
        double reportValue = completedProblems;
        double exactPercentage = 86.75;
        int WholePercentage = (int) exactPercentage;
        int solvedproblems = 47;
        int practicedDays = 5;
        double average = (solvedproblems / practicedDays);
        System.out.println("Report Value: " + reportValue);
        System.out.println("Whole Percentage: " + WholePercentage);
        System.out.println("Average: " + average);

    }

}
