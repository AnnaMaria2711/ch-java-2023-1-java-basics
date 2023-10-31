public class IfElseAufgaben {
    public static void main(String[] args) {

        double valueA = -8.45454;
        double valueB = 45.1111;
        int valueC = 5;
        String a = "reliefpfeiler";
        double result = add(valueA, valueB);

        if (valueA < valueB) {
            System.out.println("8.45454 + 45.1111 = " + result);
        } else {
            double res = subtract(valueA, valueB);
            System.out.println(" 33.6 - 44.87 = " + res);
        }

        double result1 = makePositive(valueA);
        System.out.println(result1);

        int result2 = evenNumber(valueC);
        System.out.println(result2);

        if (palindrome(a)) {
            System.out.println(a + " ist ein Palindrom.");
        }
        else {
            System.out.println("Es ist kein Palindrom.");
        }
    }

    public static double add(double valueA, double valueB) {
        return valueA + valueB;
    }

    public static double subtract(double valueC, double valueD) {
        return valueC - valueD;
    }

    public static double makePositive(double valueE) {
        if (valueE > 0) {
            return valueE;
        } else {
            return valueE - (valueE * 2);
        }
    }

    public static int evenNumber(int valueC) {
        if (valueC % 2 == 0) {
            return valueC;
        } else {
            return valueC * 2;
        }
    }

    public static boolean palindrome(String a) {
        int laenge = a.length();
        for (int i = 0; i < laenge/2; i++) {
            if (a.charAt(i) != a.charAt(laenge - 1 - i)) { // man muss -1 machen, weil wenn man direkt - i macht, gibt es nach einer weile keine Buchstaben mehr zum vergleichen gibt
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}