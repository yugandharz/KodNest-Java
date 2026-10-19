public class traceSensorReadings {
    public static void main(String[] args) {
        int[] readings = {18,21,20,24,19};
        int correctionIndex = 2;
        int correction = 3;
        System.out.println("Reading count: " + readings.length);
        System.out.println("Before: " + readings[correctionIndex]);
        readings[correctionIndex] += correction;
        System.out.println("After: " + readings[correctionIndex]);
        System.out.println("last index value: " + readings[readings.length - 1]);
    }
}
