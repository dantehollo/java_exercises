public class TeenNumberChecker {
    public static boolean hasTeen(int numOne, int numTwo, int numThree) {
        if(numOne >= 13 && numOne <= 19) {
            return true;
        } else if(numTwo >= 13 && numTwo <=19) {
            return true;
        } else if(numThree >= 13 && numThree <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age) {
        if(age >= 13 && age <= 19){
            return true;
        }
        return false;
    }
}
