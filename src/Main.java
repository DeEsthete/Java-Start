import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(separateNumber(1.22));
        System.out.println(getMultiplication(2, 5));
        System.out.println(getYearOld(2001));
        System.out.println("100 TO RUB: " + valueToCurrency(100, Currency.RUB));
        System.out.println("100 TO USD: " + valueToCurrency(100, Currency.USD));
        System.out.println("100 TO EUR: " + valueToCurrency(100, Currency.EUR));
        System.out.println(isLuckyNumber(1213));
        showMathOperation(1, 2, 3, 5, 6);
        System.out.println("==============TEST==============");
        System.out.println(Math.pow(3, 1.0 / 2));
    }

    private static String separateNumber(double number) {
        int total = (int)number;
        double other = number - total;
        return "Total:" + total + " Other: " + other;
    }

    private static int getMultiplication(int first, int second) {
        return first * second;
    }

    private static int getYearOld(int birthYear) {
        return LocalDateTime.now().getYear() - birthYear;
    }

    private static double valueToCurrency(double value, Currency currency) {
        switch (currency) {
            case RUB:
                return value * 0.17;
            case USD:
                return value * 0.0027;
            case EUR:
                return value * 0.0024;
            default: throw new IllegalArgumentException();
        }
    }

    private static boolean isLuckyNumber(int number) {
        String numberText = "" + number;

        if (numberText.length() < 4 || numberText.length() > 4) {
            throw new IllegalArgumentException();
        }

        String firstPart = numberText.substring(0, numberText.length() / 2 - numberText.length() % 2);
        String secondPart = numberText.substring(numberText.length() / 2 - numberText.length() % 2, numberText.length());

        return firstPart.equals(secondPart);
    }

    private static void showMathOperation(double a, double x, double y, double b, double c) {
        System.out.println(Math.pow((a + 1), 1 / 3));
        System.out.println(Math.pow(Math.sin(x), 2) + Math.cos(Math.pow(x, 2)));
        System.out.println(-5 + Math.sqrt(x + Math.sqrt(y)));
        System.out.println((b - (b + b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);
    }
}

enum Currency{
    RUB,
    USD,
    EUR
}