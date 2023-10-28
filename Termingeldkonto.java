package bank;

public class Termingeldkonto extends Geldeinlage{

    public Termingeldkonto(String iban, double kontostand, double zinssatz, int laufzeitMonat) {
        super(iban, kontostand, zinssatz, laufzeitMonat);
    }



    @Override
    public void einzahlen(double betrag) {
        System.out.println("Einzahlung nicht moeglich.");
    }

    @Override
    public double getPrognose(){
        return this.startKapital + Math.pow(this.kontostand * (1 + this.zinssatz), this.laufzeitMonat/12 );
    }
}
