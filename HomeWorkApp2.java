package HomeWork;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        area10and20(1, 4);
        negativeOrPositive(-8);
        negativeNumber(5);
        printString("Yahoo", 5);
        leapYear(2003);
    }

    private static boolean leapYear(int year) {
        if ((year % 4) == 0 && (year % 100) != 0) {
            return true;
        } else if ((year % 400) == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String Attemp, int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(Attemp);
        }
    }

    private static boolean negativeNumber(int num) {
        if (num < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void negativeOrPositive(int numb) {
        if (numb >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

    }

    private static boolean area10and20(int a, int b) {
        if ((a + b) > 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }

    }
}
