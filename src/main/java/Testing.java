public class Testing {
    public static void main(String[] args) {

    }
    public static int multiply(int valueA, int valueB){
        return valueA * valueB;
    }

    public static int divide(int valA, int valB){
        return valA / valB;
    }

    public static int add(int value1,int value2){
        return value1 + value2;
    }

    public static boolean evenNumber(int valueC) {
        if (valueC % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static String lowerCaseToUpperCase(String s){
        return s.toUpperCase();
    }
    public static boolean checkForPositive(double valueE) {
        if (valueE > 0) {
            return true;
        } else {
            return false;
        }
    }

}
