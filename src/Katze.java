public class Katze extends Saeugetier {
    private boolean jagtMaeuse;
    private String rasse;

    public boolean isJagtMaeuse() {
        return jagtMaeuse;
    }

    public void setJagtMaeuse(boolean jagtMaeuse) {
        this.jagtMaeuse = jagtMaeuse;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        if (rasse == null) {
            this.rasse = "Unbekannt";
        }
        else {
            this.rasse = rasse;
        }
    }

    public Katze() {
        super("Unbekannt", 1, 1.2, true, "braun", 4, false);
        this.jagtMaeuse = true;
        this.rasse = "Unbekannt";
    }

    public Katze(String name, int alter, double gewicht, boolean lebendig, String fellfarbe, int anzahlBeine, boolean traechtig, boolean jagtMaeuse, String rasse) {
        super(name, alter, gewicht, lebendig, fellfarbe, anzahlBeine, traechtig);
        this.jagtMaeuse = jagtMaeuse;
        this.rasse = rasse;
    }

    public void miauen() {
        System.out.println("Miau!");
    }
    public void schnurren() {
        System.out.println("Wenn du nicht weißt wie das klingt: Kauf dir einen Katze.");
    }

    @Override
    public void bewegen() {
        System.out.println("Ich schliche mich quer durch die Wiese.");
    }
}
