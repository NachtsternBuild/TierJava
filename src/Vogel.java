public class Vogel extends Tier {
    private double fluegelspannweite;
    private boolean kannFliegen;

    public double getFluegelspannweite() {
        return fluegelspannweite;
    }

    public void setFluegelspannweite(double fluegelspannweite) {
        if (fluegelspannweite == 0 ) {
            this.fluegelspannweite = 1.2;
        }
        else {
            this.fluegelspannweite = fluegelspannweite;
        }
    }

    public boolean isKannFliegen() {
        return kannFliegen;
    }

    public void setKannFliegen(boolean kannFliegen) {
        this.kannFliegen = kannFliegen;
    }

    public Vogel() {
        super("Unbekannt", 1, 1.0, true);
        this.fluegelspannweite = 1.2;
        this.kannFliegen = true;
    }

    public Vogel(String name, int alter, double gewicht, boolean lebendig, double fluegelspannweite, boolean kannFliegen) {
        super(name, alter, gewicht, lebendig);
        this.fluegelspannweite = fluegelspannweite;
        this.kannFliegen = kannFliegen;
    }

    public void fliegen() {
        if (kannFliegen) {
            System.out.println("Flatter, flatter.");
        }
    }
}
