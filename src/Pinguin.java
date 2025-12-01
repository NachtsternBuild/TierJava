public class Pinguin extends Vogel {
    private double maxTauchtiefe;
    private boolean laeuftLangsam;

    public double getMaxTauchtiefe() {
        return maxTauchtiefe;
    }

    public void setMaxTauchtiefe(double maxTauchtiefe) {
        if (maxTauchtiefe == 0) {
            this.maxTauchtiefe = 1;
        }
        else {
            this.maxTauchtiefe = maxTauchtiefe;
        }
    }

    public boolean isLaeuftLangsam() {
        return laeuftLangsam;
    }

    public void setLaeuftLangsam(boolean laeuftLangsam) {
        this.laeuftLangsam = laeuftLangsam;
    }

    public Pinguin() {
        super("Unbekannt", 1, 10, true, 0.8, false);
        this.maxTauchtiefe = 45.0;
        this.laeuftLangsam = true;
    }

    public Pinguin(String name, int alter, double gewicht, boolean lebendig, double fluegelspannweite, boolean kannFliegen, double maxTauchtiefe, boolean laeuftLangsam) {
        super(name, alter, gewicht, lebendig, fluegelspannweite, kannFliegen);
        this.maxTauchtiefe = maxTauchtiefe;
        this.laeuftLangsam = laeuftLangsam;
    }

    public void schwimmen() {
        System.out.println("Schwimmen, schwimmern und noch mehr schwimmen.");
    }
    public void tauchen() {
        System.out.println("Wir befinden uns ziemlich weit unter Wasser.");
    }

    @Override
    public void bewegen() {
        System.out.println("Ich watschel stundenlang über's Eis und bekomme keine kalten Füße");
    }
}
