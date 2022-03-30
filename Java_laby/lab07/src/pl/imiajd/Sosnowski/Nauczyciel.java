package pl.imiajd.Sosnowski;

public class Nauczyciel extends Osoba {
    private final double pensja;

    public Nauczyciel(String nazwisko, String rokUrodzenia, double pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String getNazwisko() {return super.getNazwisko();}

    @Override
    public String getRokUrodzenia() {return super.getRokUrodzenia();}
    double getPensja() {return pensja;}

    @Override
    public String toString() {
        String waluta = "zł";
        return this.getNazwisko() + "\n" + this.getRokUrodzenia() + "\n" + this.getPensja() + waluta;
    }
}

