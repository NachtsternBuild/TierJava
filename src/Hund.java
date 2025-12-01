public class Hund extends Saeugetier {
    private boolean istSpuerhund;
    private int bellStaerke;

    public boolean isIstSpuerhund() {
        return istSpuerhund;
    }

    public void setIstSpuerhund(boolean istSpuerhund) {
        this.istSpuerhund = istSpuerhund;
    }

    public int getBellStaerke() {
        return bellStaerke;
    }

    public void setBellStaerke(int bellStaerke) {
        if (bellStaerke == 0) {
            this.bellStaerke = 1;
        }
        else {
            this.bellStaerke = bellStaerke;
        }
    }

    public Hund() {
        super("Unbekannt", 1, 1.2, true, "braun", 4, false);
        this.istSpuerhund = false;
        this.bellStaerke = 2;
    }

    public Hund(String name, int alter, double gewicht, boolean lebendig, String fellfarbe, int anzahlBeine, boolean traechtig, boolean istSpuerhund, int bellStaerke) {
        super(name, alter, gewicht, lebendig, fellfarbe, anzahlBeine, traechtig);
        this.istSpuerhund = istSpuerhund;
        this.bellStaerke = bellStaerke;
    }

    public void bellen() {
        System.out.println("Wuff, wuff! Ich bin ein Hund und kann nichts anderes als bellen.");
    }

    @Override
    public void bewegen() {
        System.out.println("Ich renne quer durch die Gegend und zeihe Herrchen und Frauchen hinter mir her.");
    }
}
