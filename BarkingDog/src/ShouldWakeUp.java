public class ShouldWakeUp {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23 || !isBarking) {
            return false;
        } else return hourOfDay < 8 || hourOfDay > 22;
    }
}
