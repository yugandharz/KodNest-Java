public class WeeklyProgressReport {
    public static void main(String[] args) {
        int CompletedTopics = 17;
        int TotalTopics = 20;
        int DailyLearningHours = 3;
        int LearningDays = 5;
        int RemainingTopics = TotalTopics - CompletedTopics;
        int WeeklyLearningHours = DailyLearningHours * LearningDays;
        double ProgressPercentage = (double) CompletedTopics * 100/TotalTopics;
        System.out.println("Completed Topics: " + CompletedTopics);
        System.out.println("Remaining Topics: " + RemainingTopics);
        System.out.println("Weekly Learning Hours: " + WeeklyLearningHours);
        System.out.println("Progress Percentage: " + ProgressPercentage);

    }
}