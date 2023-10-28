package bank;

public class Sparplankonto extends Geldeinlage{

    protected double sparbetragMonatlich;


    public Sparplankonto(String iban, double kontostand, double zinssatz, int laufzeitMonat, double sparbetragMonatlich) {
        super(iban, kontostand, zinssatz, laufzeitMonat);
        this.sparbetragMonatlich = sparbetragMonatlich;
    }

    public double getSparbetragMonatlich() {
        return sparbetragMonatlich;
    }

    public void setSparbetragMonatlich(double sparbetragMonatlich) {
        this.sparbetragMonatlich = sparbetragMonatlich;
    }
}
