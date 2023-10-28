package bank;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Konto> konten = new ArrayList<>();
    public static List<Kunde> kunden = new ArrayList<>();

    public static void main(String[] args) {
        initDemoData();

        System.out.println("*** KUNDEN ***");
        printKunden(kunden);
        System.out.println("*** KONTEN ***");
        printKonten(konten);
        System.out.println("*** HOECHSTER KONTOSTAND ***");
        printKonto(getKontoMitHoechstenKontostand());


    }

    public static void printKonten(List<Konto> konten) {
    for(Konto k : konten){
        printKonto(k);
    }
    }

    public static void printKonto(Konto konto) {
    if (konto instanceof Girokonto){
        System.out.printf("%s, Kontostand: %f\n",
              konto.getIban(),
              konto.getKontostand());
        System.out.println();}
        if (konto instanceof Termingeldkonto){
            System.out.printf("%s, Kontostand: %f, Zinssatz: %f%, Laufzeit: %d Monate, Prognose: %f\n",
                    konto.getIban(),
                    konto.getKontostand(),
                    konto.geldeinlage.getZinssatz(),
                    konto.geldeinlage.getLaufzeitMonat(),
                    konto.geldeinlage.getPrognose());
            System.out.println();}
            if (konto instanceof Sparplankonto){
            System.out.print("Ich bin zu faul, um die Ausgabe zu vervollstaendigen!\n");
                System.out.println();
            }
        }



    public static void printKunden(List<Kunde> kunden) {
        for (Kunde k : kunden) {
            printKunde(k);
        }

    }

    public static void printKunde(Kunde kunde) {
        if (kunde instanceof Privatkunde) {
            System.out.printf("%s %s: %s\n",
               ((Privatkunde) kunde).getVorname(),
               ((Privatkunde) kunde).getNachname(),
               kunde.getKonto());
            System.out.println();
        }
        if (kunde instanceof Firmenkunde){
            System.out.printf("%s: %s\n",
               ((Firmenkunde) kunde).getFirmenname(),
               kunde.getKonto());
            System.out.println();
        }
    }


    public static  Konto getKontoMitHoechstenKontostand() {
        Konto kontoMitHoechstenKontostand = konten.get(0);
        for (Konto k : konten) {
            if (k.kontostand > kontoMitHoechstenKontostand.kontostand) {
                kontoMitHoechstenKontostand = k;
            }
        }
        return kontoMitHoechstenKontostand;

    }

    public static void initDemoData() {

        Girokonto girokonto1 = new Girokonto("AT0089705678", 3000, 5000);
        Girokonto girokonto2 = new Girokonto("AT9086437800", 90000, 100000);
        Termingeldkonto termingeldkonto1 = new Termingeldkonto("AT676999022", 400, 3, 9);
        Termingeldkonto termingeldkonto2 = new Termingeldkonto("AT676997822", 40023, 10, 12);
        Sparplankonto sparplankonto1 = new Sparplankonto("AT23456789", 2000, 12, 23, 200);
        Sparplankonto sparplankonto2 = new Sparplankonto("AT23423333789", 2050, 12, 23, 200);
        Sparplankonto sparplankonto3 = new Sparplankonto("AT2444433789", 20, 12, 23, 50);

        konten.add(girokonto1);
        konten.add(girokonto2);
        konten.add(termingeldkonto1);
        konten.add(termingeldkonto2);
        konten.add(sparplankonto1);
        konten.add(sparplankonto2);
        konten.add(sparplankonto3);

        Firmenkunde firmenkunde1 = new Firmenkunde("Sanas Hundesalon");
        Firmenkunde firmenkunde2 = new Firmenkunde("Tortenfabrik Oma Hildegard");
        Firmenkunde firmenkunde3 = new Firmenkunde("Metal-Merch Wien");
        Privatkunde privatkunde1 = new Privatkunde("Susi", "Reitbauer");
        Privatkunde privatkunde2 = new Privatkunde("Herbert", "Nöstlinger");
        Privatkunde privatkunde3 = new Privatkunde("Christina", "Miczka");

        kunden.add(firmenkunde1);
        kunden.add(firmenkunde2);
        kunden.add(firmenkunde3);
        kunden.add(privatkunde1);
        kunden.add(privatkunde2);
        kunden.add(privatkunde3);

        girokonto1.setKunde(firmenkunde1);
        girokonto2.setKunde(firmenkunde2);
        termingeldkonto1.setKunde(firmenkunde3);
        termingeldkonto2.setKunde(firmenkunde1);
        sparplankonto1.setKunde(privatkunde1);
        sparplankonto2.setKunde(privatkunde2);
        sparplankonto3.setKunde(privatkunde3);


    }
}
