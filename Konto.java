package bank;

public class Konto {

    protected String iban;
    protected double kontostand;
    protected double startKapital;

    protected Kunde kunde;

    protected Geldeinlage geldeinlage;


    public Konto(String iban, double kontostand) {
        this.iban = iban;
        this.kontostand = kontostand;
        this.startKapital = kontostand;
    }

    public void einzahlen(double betrag) {
        this.kontostand += betrag;
    }

    public void auszahlen(double betrag) {
        this.kontostand -= betrag;
    }



    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public double getStartKapital() {
        return startKapital;
    }

    public void setStartKapital(double startKapital) {
        this.startKapital = startKapital;
    }

    public Geldeinlage getGeldeinlage() {
        return geldeinlage;
    }

    public void setGeldeinlage(Geldeinlage geldeinlage) {
        this.geldeinlage = geldeinlage;
    }
}
