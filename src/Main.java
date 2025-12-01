void main() {
    ArrayList<Tier> zoo = new ArrayList<>();

    // Tiere hinzufügen
    zoo.add(new Katze("Tomte", 10, 5, true, "rot", 4, false, false, "Siamese"));
    zoo.add(new Hund("Berni", 3, 10, true, "weiß", 4, false, true, 5));
    zoo.add(new Mensch("Heiner", 65, 100, true, null, 2, false, true, false, "braun", 3));
    zoo.add(new Pinguin("Luna", 2, 15, true, 0.8, false, 50, false));
    zoo.add(new Adler("Lina", 5, 7, true, 2.2, true, 2500, 5));
    zoo.add(new Seehund("Waldemar", 1, 85, true, "grau", 0, false, 120, false));

    // Ausgabe aller Tiere
    System.out.println("Zoo Übersicht:");
    for (Tier t : zoo) {
        System.out.println("Tiere: " + t);
    }

    System.out.println("Wie sich die Tiere bewegen: ");
    for (Tier t : zoo) {
        System.out.print("Mein " + t.getName() + ": ");
        t.bewegen();
    }
}
