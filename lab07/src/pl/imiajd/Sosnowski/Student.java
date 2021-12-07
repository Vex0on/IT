package pl.imiajd.Sosnowski;

public class Student extends Osoba {
    private final String kierunek;

    public Student(String nazwisko,String rokUrodzenia,String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }
    @Override
    public String getNazwisko() { return super.getNazwisko();}

    @Override
    public String getRokUrodzenia() {return super.getRokUrodzenia();}
    public String getKierunek() {return kierunek;}

    @Override
    public String toString() {
        return this.getNazwisko() + "\n" + this.getRokUrodzenia() + "\n" + this.getKierunek();
    }
}