public class Adler extends Vogel {
    private double hoehenflugMax;
    private double sichtweiteInKm;

    public double getHoehenflugMax() {
        return hoehenflugMax;
    }

    public void setHoehenflugMax(double hoehenflugMax) {
        if (hoehenflugMax == 0) {
            this.hoehenflugMax = 1;
        }
        else {
            this.hoehenflugMax = hoehenflugMax;
        }
    }

    public double getSichtweiteInKm() {
        return sichtweiteInKm;
    }

    public void setSichtweiteInKm(double sichtweiteInKm) {
        if (sichtweiteInKm == 0) {
            this.sichtweiteInKm = 1;
        }
        else {
            this.sichtweiteInKm = sichtweiteInKm;
        }
    }

    public Adler() {
        super("Unbekannt", 1, 1.0, true, 2, true);
        this.hoehenflugMax = 2000;
        this.sichtweiteInKm = 2;
    }

    public Adler(String name, int alter, double gewicht, boolean lebendig, double fluegelspannweite, boolean kannFliegen, double hoehenflugMax, double sichtweiteInKm) {
        super(name, alter, gewicht, lebendig, fluegelspannweite, kannFliegen);
        this.hoehenflugMax = hoehenflugMax;
        this.sichtweiteInKm = sichtweiteInKm;
    }

    public void kreisen() {
        System.out.println("Ich drehe meine Kreise bis mir schlecht ist.");
    }
    public void kreischen() {
        System.out.println("Und schreie dabei, so ein bisschen.");
    }

    @Override
    public void bewegen() {
        System.out.println("Ich bin der König der Lüfte und keine kann mich aufhalten.");
    }
}
