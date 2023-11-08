package org.example.KlassenUndObjekte;

import java.util.Scanner;

public class Auto {

    Scanner sc = new Scanner(System.in);
    String marke;
    String modell;
    String farbe;
    String baujahr;

    int beschleunigung;
    boolean isCarStarted;

    int geschwindigkeit;

    Auto(String marke, String modell, String farbe, String baujahr) {

        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.baujahr = baujahr;
        this.isCarStarted = false;
        this.geschwindigkeit = 0;
    }

    public int speedUpCar() {
        geschwindigkeit += beschleunigung ;
        System.out.println("Das Auto wurde um 10 km/h beschleunigt. Geschwindigkeit: " +geschwindigkeit);
        return geschwindigkeit;
    }

    public void setVelocity() {
        System.out.println("Gib die jetztige Geschwindigkeit an.");
        geschwindigkeit = sc.nextInt();
        System.out.println("Gib an um wie viel das Auto beschleunigt werden soll");
        int beschleunigung = sc.nextInt();
        int sum = geschwindigkeit + beschleunigung;
        System.out.println("Die jetzige Geschwindigkeit des Autos beträgt: " + geschwindigkeit);
        System.out.println("Die gewünschte Beschleunigung beträgt: " + beschleunigung);
        System.out.println("Die neue Geschwindigkeit beträgt: " + sum);
    }

    public void startCar() {
        isCarStarted = true;
        System.out.println("Auto wurde gestartet.");

    }
}

