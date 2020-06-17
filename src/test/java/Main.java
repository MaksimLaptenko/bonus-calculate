public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount,registered);

        boolean passed = actual == expected;
        System.out.println(passed);


        long bonus = service.calculate(500_000,false);
        System.out.println(bonus);

        long bonus2 = service.calculate(500000_60,true);
        System.out.println(bonus2);

        long bonus3 = service.calculate(100_60,false);
        System.out.println(bonus3);

        long bonus4 = service.calculate(100000_60,true);
        System.out.println(bonus4);
    }

}
