public class Main {
    public static void main(String[] args) {
        // 1. Tworzymy produkty
        ProduktMenu p1 = new ProduktMenu("K-01", "Espresso", 9.0, "kawa");
        ProduktMenu p2 = new ProduktMenu("K-02", "Cappuccino", 13.5, "kawa");
        ProduktMenu p3 = new ProduktMenu("D-01", "Sernik", 16.0, "deser");
        ProduktMenu p4 = new ProduktMenu("K-03", "Herbata", 9.0, "herbata");

        // 2. Tworzymy klienta
        KlientKawiarni klient = new KlientKawiarni(100, "Jadwiga", "Mazur", "j.mazur@mail.pl");

        // 3. Tworzymy zamówienie i dodajemy produkty
        Zamowienie zamowienie = new Zamowienie(klient);
        zamowienie.dodajProdukt(p1);
        zamowienie.dodajProdukt(p2);
        zamowienie.dodajProdukt(p3);
        zamowienie.dodajProdukt(p4);

        // 4. Wyświetlamy podsumowanie
        System.out.println(klient);
        System.out.println(zamowienie);
        System.out.println("Łączna wartość: " + zamowienie.policzWartosc() + " zł");
        System.out.println("Liczba pozycji: " + zamowienie.policzLiczbeProduktow());
        System.out.println("Łączna liczba produktów w systemie: " + ProduktMenu.getLiczbaProduktow());

        // 5. Test equals
        ProduktMenu kopiaEspresso = new ProduktMenu("K-01", "Espresso duplikat", 9.0, "kawa");
        System.out.println("Czy produkty są równe (ten sam kod)? " + p1.equals(kopiaEspresso));

        // 6. Opłacenie
        zamowienie.oznaczJakoOplacone();
        System.out.println("Po opłaceniu: " + zamowienie);
    }
}