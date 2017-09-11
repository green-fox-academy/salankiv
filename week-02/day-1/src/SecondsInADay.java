public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented bt the variables

        int secondsPerDay = 60 * 60 * 24;
        int secondsPerHour = 60 * 60;
        int secondsPerMinute = 60;
        int secondsSoFar = (currentHours * secondsPerHour) + (currentMinutes * secondsPerMinute) + currentSeconds;
        int secondsRemaining = secondsPerDay - secondsSoFar;

        System.out.println(secondsPerDay);
        System.out.println(secondsSoFar);
        System.out.println(secondsRemaining);
    }
}