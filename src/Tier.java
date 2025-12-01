public class Tier {
    private String name;
    private int alter;
    private double gewicht;
    private boolean lebendig;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "Unbekannt";
        }
        else {
            this.name = name;
        }
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        if (gewicht == 0) {
            this.gewicht = 1;
        }
        else {
            this.gewicht = gewicht;
        }
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public boolean isLebendig() {
        return lebendig;
    }

    public void setLebendig(boolean lebendig) {
        this.lebendig = lebendig;
    }

    public Tier() {
        this.name = "Unbekannt";
        this.alter = 1;
        this.gewicht = 10.0;
        this.lebendig = true;
    }

    public Tier(String name, int alter, double gewicht, boolean lebendig) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.lebendig = lebendig;
    }
    public void essen() {
        System.out.println("Ich esse nicht stören");
    }
    public void schlafen() {
        System.out.println("Zzz");
    }

    public void bewegen() {
        System.out.println("So ich Laufe jetzt vor mich hin.");
    }

    @Override
    public String toString() {
        return "Tier{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", gewicht=" + gewicht +
                ", lebendig=" + lebendig +
                '}';
    }
}
