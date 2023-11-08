import java.util.Scanner;

public class AufgabeKlassenUndObjekte {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Auto myCar = new Auto("Ford","F-150","schwarz","2023");
        myCar.startCar();
        myCar.setVelocity();
    }
}
