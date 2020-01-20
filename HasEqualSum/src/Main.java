public class Main {
    public static void main(String[] args) {
        //True
        boolean check = EqualSumChecker.hasEqualSum(1, 2, 3);
        System.out.println(check);

        //False
        check = EqualSumChecker.hasEqualSum(1, 3, 3);
        System.out.println(check);

        //False
        check = EqualSumChecker.hasEqualSum(1, 2, 5);
        System.out.println(check);
    }
}
