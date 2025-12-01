public class Mensch extends Saeugetier {
    private boolean schlaeft;
    private boolean kannComputerBenutzen;
    private String augenfarbe;
    private int gangart;

    public boolean isKannComputerBenutzen() {
        return kannComputerBenutzen;
    }

    public void setKannComputerBenutzen(boolean kannComputerBenutzen) {
        this.kannComputerBenutzen = kannComputerBenutzen;
    }

    public String getAugenfarbe() {
        return augenfarbe;
    }

    public void setAugenfarbe(String augenfarbe) {
        if (augenfarbe == null) {
            this.augenfarbe = "blau";
        }
        else {
            this.augenfarbe = augenfarbe;
        }
    }

    public int getGangart() {
        return gangart;
    }

    public void setGangart(int gangart) {
        if (gangart < 1){
            this.gangart = 1;
        }
        else {
            this.gangart = gangart;
        }
    }

    public boolean isSchlaeft() {
        return schlaeft;
    }

    public void setSchlaeft(boolean schlaeft) {
        this.schlaeft = schlaeft;
    }

    public Mensch() {
        super("Unbekannt", 20, 75, true, null, 2, false);
        this.schlaeft = false;
        this.kannComputerBenutzen = true;
        this.augenfarbe = "blue";
        this.gangart = 1;
    }

    public Mensch(String name, int alter, double gewicht, boolean lebendig, String fellfarbe, int anzahlBeine, boolean traechtig, boolean schlaeft, boolean kannComputerBenutzen, String augenfarbe, int gangart) {
        super(name, alter, gewicht, lebendig, fellfarbe, anzahlBeine, traechtig);
        this.schlaeft = schlaeft;
        this.kannComputerBenutzen = kannComputerBenutzen;
        this.augenfarbe = augenfarbe;
        this.gangart = gangart;
    }

    public void redet() {
        System.out.println("Bla, bla, bla und bla, bla, bla");
    }
    @Override
    public void essen() {
        System.out.println("Jetzt gibt es ein schönes Stück Kuchen.");
    }
    @Override
    public void schlafen() {
        if (schlaeft) {
            System.out.println("Zzz...Zzz...Zzz");
        }
    }

    @Override
    public void bewegen() {
        if (gangart == 1) {
            System.out.println("Ich laufe durch die Gegend.");
        }
        else if (gangart == 2) {
            System.out.println("Jetzt spaziere ich hier herum und kenne das Ziel nicht.");
        }
        else if (gangart == 3) {
            System.out.println("Ein schöner Sprint für die Fitness.");
        }
        else if (gangart == 4) {
            System.out.println("Ich laufe Kaffeebohnen und mache alle auf dem Fußweg verrückt, weil ich so langsam laufe.");
        }
    }
}
