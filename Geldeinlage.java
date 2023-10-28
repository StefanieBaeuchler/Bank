package bank;

public class Geldeinlage  extends Konto implements Finance{

    protected double zinssatz;
    protected int laufzeitMonat;


    public Geldeinlage(String iban, double kontostand, double zinssatz, int laufzeitMonat) {
        super(iban, kontostand);
        this.zinssatz = zinssatz;
        this.laufzeitMonat = laufzeitMonat;
    }

    @Override
    public void auszahlen(double betrag) {
       System.out.println("Auszahlung nicht moeglich.");
    }

    public double getPrognose(){
        return this.kontostand;
    }


    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public int getLaufzeitMonat() {
        return laufzeitMonat;
    }

    public void setLaufzeitMonat(int laufzeitMonat) {
        this.laufzeitMonat = laufzeitMonat;
    }
}
