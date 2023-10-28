package bank;

public class Girokonto extends Konto {

    protected double disporahmen;


    public Girokonto(String iban, double kontostand, double disporahmen) {
        super(iban, kontostand);
        this.disporahmen = disporahmen;
    }

    @Override
    public void auszahlen(double betrag) {
        if (this.kontostand - betrag < this.disporahmen) {
            System.out.print("Der Betrag ist zu hoch. Auszahlung nicht moeglich.");

        } else {
            this.kontostand -= betrag;
        }
    }

    public double getDisporahmen() {
        return disporahmen;
    }

    public void setDisporahmen(double disporahmen) {
        this.disporahmen = disporahmen;
    }
}
