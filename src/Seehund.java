public class Seehund extends Saeugetier {
    private double tauchtiefe;
    private boolean kannUnterWasserAtmen;

    public double getTauchtiefe() {
        return tauchtiefe;
    }

    public void setTauchtiefe(double tauchtiefe) {
        if (tauchtiefe == 0) {
            this.tauchtiefe = 1;
        }
        else {
            this.tauchtiefe = tauchtiefe;
        }
    }

    public boolean isKannUnterWasserAtmen() {
        return kannUnterWasserAtmen;
    }

    public void setKannUnterWasserAtmen(boolean kannUnterWasserAtmen) {
        this.kannUnterWasserAtmen = kannUnterWasserAtmen;
    }

    public Seehund() {
        super("Unbekannt", 1, 70, true, "grau", 0, false);
        this.tauchtiefe = 50;
        this.kannUnterWasserAtmen = false;
    }

    public Seehund(String name, int alter, double gewicht, boolean lebendig, String fellfarbe, int anzahlBeine, boolean traechtig, double tauchtiefe, boolean kannUnterWasserAtmen) {
        super(name, alter, gewicht, lebendig, fellfarbe, anzahlBeine, traechtig);
        this.tauchtiefe = tauchtiefe;
        this.kannUnterWasserAtmen = kannUnterWasserAtmen;
    }

    public void schwimmen() {
        System.out.println("Swim, swam, swum");
    }

    public void tauchen() {
        System.out.println("Auf Tauchstationen!");
    }

    @Override
    public void bewegen() {
        System.out.println("Ich robbe ins Wasser und könne mir mal einen Fisch");
    }
}
