import java.util.Objects;

public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow = 0;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    public double getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return nazwa + " (" + kod + ") - " + cena + " zł";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProduktMenu that = (ProduktMenu) o;
        return Objects.equals(kod, that.kod);
    }
}