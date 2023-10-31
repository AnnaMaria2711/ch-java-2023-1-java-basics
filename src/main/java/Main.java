public class Main {

    public static void main (String[] args) {

        String name = "Hello World";
        name = "Test";

        int age = 18;

        long veryBigNumber = 13000000L; //Das L ist das Spezifika für 'long'-nummern

        float kommazahl32 = 0.0001f; //Das f ist das Spezifika für 'long'-nummern

        double kommazahl64 = 0.000000056;

        char oneCharacter = 'A';

        boolean wahrheitswert = true;

        int sum = age / 4;

        double result = 0.3 + 0.2;
        String text = "Hallo" + "Welt" + age;

        System.out.println(text);
        System.out.println(name); //Weil diese Variable schon initialisiert wurde, kann man sie einfach mit dem Variablennamen aufrufen.
        System.out.println(age);
        System.out.println(veryBigNumber);
        System.out.println(kommazahl32);
        System.out.println(kommazahl64);
        System.out.println(oneCharacter);
        System.out.println(wahrheitswert);


        boolean same = "Hallo" == "Welt";

        boolean notSame = "Hi" != "hallo";

        boolean isBigger = 3 > 0;

        boolean isLower = 3 <= 5;



        System.out.println(same);
        System.out.println(notSame);
        System.out.println(isBigger);
        System.out.println(isLower);


        boolean isValue1 = true;
        boolean isValue2 = false;

        System.out.println("Wahr"+ (isValue1 && isValue2));

        System.out.println("Wahr" + (isValue1|| isValue2));


    }

}
