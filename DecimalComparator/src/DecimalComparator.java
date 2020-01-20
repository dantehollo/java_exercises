public class DecimalComparator {
    public static boolean areEqualByThreePlaces(double numOne, double numTwo){
        int numOneInt = (int) (numOne * 1000);
        int numTwoInt = (int) (numTwo * 1000);

        System.out.println(numOneInt);
        System.out.println(numTwoInt);

        return numOneInt == numTwoInt;
    }
}
