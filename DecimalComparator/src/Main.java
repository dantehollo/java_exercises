public class Main {
    public static void main(String[] args) {
        //True
        boolean isEqual = DecimalComparator.areEqualByThreePlaces(3.155, 3.155);
        System.out.println(isEqual);

        //False
        isEqual = DecimalComparator.areEqualByThreePlaces(3.156, 3.155);
        System.out.println(isEqual);

        //False
        isEqual = DecimalComparator.areEqualByThreePlaces(5.156, 3.155);
        System.out.println(isEqual);
    }
}
