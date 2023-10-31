public class IfElse {

    public static void main(String[] args) {
        int age = 12;

        if (age > 18) {
            System.out.println("Die Person ist über 18 Jahre alt.");

        } else if (age == 18) {
            System.out.println("Die Person ist 18 Jahre alt.");
        } else if (age < 0) {
            System.out.println("Fehler: Das Alter einer Person kann nicht im Negativen liegen ");


        } else {
            System.out.println("Die Person ist zu jung");
        }

        System.out.println("---------------------");
        int result = addieren();
        System.out.println(result);


        int result1 = addieren(8, 45);
        int result2 = addieren(53, 45);
        turnOffLights();
    }

    public static void turnOffLights() {
        System.out.println("Aufstehen");
        System.out.println("Zum Lichtschalter gehen");
        System.out.println("Den Lichtschalter betätigen.");
    }

    public static int addieren() {
        return 1 + 1;

    }

    public static int addieren(int valueA, int valueB) {
        return valueA + valueB;


    }











}