package pl.imiajd.Sosnowski;

class Osoba {

    private final String nazwisko;
    private final String rokUrodzenia;

        public Osoba(String nazwisko,String rokUrodzenia) {
            this.nazwisko = nazwisko;
            this.rokUrodzenia = rokUrodzenia;
        }

        public String getNazwisko() { return nazwisko;}
        public String getRokUrodzenia() {return rokUrodzenia;}

        @Override
        public String toString() {
            return this.getNazwisko() + "\n" + this.getRokUrodzenia();
        }
}
