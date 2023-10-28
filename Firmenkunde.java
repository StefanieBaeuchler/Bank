package bank;

public class Firmenkunde extends Kunde{

    protected String firmenname;


    public Firmenkunde(String firmenname) {
        this.firmenname = firmenname;
    }

    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }
}
