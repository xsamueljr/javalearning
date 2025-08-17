package ch01.first_steps;

public class Exercising {

    public static void main(String[] args) {

        // Verdaderos
        System.out.println(isBetween1and100(5));
        System.out.println(isBetween1and100(63));
        System.out.println(isBetween1and100(98));

        // Falsos
        System.out.println(isBetween1and100(0));
        System.out.println(isBetween1and100(-60));
        System.out.println(isBetween1and100(600));
    }

    /**
     * Given a number, it returns whether it's between 1 and 100 or not
     *
     * @return true if it is, false if it is not
     * */
    private static boolean isBetween1and100(int number) {
        return number >= 1 && number <= 100;
    }
}
