public class Saeugetier extends Tier {
    private String fellfarbe;
    private int anzahlBeine;
    private boolean traechtig;

    public String getFellfarbe() {
        return fellfarbe;
    }

    public void setFellfarbe(String fellfarbe) {
        this.fellfarbe = fellfarbe;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    public boolean isTraechtig() {
        return traechtig;
    }

    public void setTraechtig(boolean traechtig) {
        this.traechtig = traechtig;
    }

    public Saeugetier() {
        super("Unbekannt", 1, 1.0, true);
        this.fellfarbe = "braun";
        this.anzahlBeine = 4;
        this.traechtig = false;
    }

    public Saeugetier(String name, int alter, double gewicht, boolean lebendig, String fellfarbe, int anzahlBeine, boolean traechtig) {
        super(name, alter, gewicht, lebendig);
        this.fellfarbe = fellfarbe;
        this.anzahlBeine = anzahlBeine;
        this.traechtig = traechtig;
    }
}
