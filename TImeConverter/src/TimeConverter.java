public class TimeConverter {
    public static void printYearsAndDays(long minutes){
        if( minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        // 1440 min to day
        // 525,600‬ min to year
        long years = minutes / 525600L;
        long remainingMinutes = minutes % 525600L;
        long days =remainingMinutes / 1440L;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
