public class Main {
    public static void main(String[] args) {
        boolean checked = TeenNumberChecker.hasTeen(19, 24, 42);
        System.out.println(checked);

        checked = TeenNumberChecker.hasTeen(20, 11, 12);
        System.out.println(checked);

        checked = TeenNumberChecker.hasTeen(20, 24, 11);
        System.out.println(checked);

        boolean checkedSecond = TeenNumberChecker.isTeen(13);
        System.out.println(checkedSecond);

        checkedSecond = TeenNumberChecker.isTeen(11);
        System.out.println(checkedSecond);

        checkedSecond = TeenNumberChecker.isTeen(26);
        System.out.println(checkedSecond);
    }
}
