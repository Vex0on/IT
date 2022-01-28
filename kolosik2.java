class Osoba implements Comparable<Osoba>{
    private String nazwisko;

    Osoba(String oto_naziwsko) {
        this.nazwisko = oto_naziwsko;
    }

    @Override
    public String toString() {
        return "Osoba o nazwisku: " + nazwisko;
    }

    @Override
    public int compareTo(Osoba o) {
        int lastnameCompare = this.nazwisko.compareTo(o.nazwisko);
        if(lastnameCompare == 0) {
            if(o instanceof Obywatel) return -1;
        }
        return lastnameCompare;
    }
}


class Obywatel extends Osoba implements Comparable<Osoba>{
    private String pesel;
    Obywatel(String oto_nazwisko, String oto_pesel) {
        super(oto_nazwisko);
        this.pesel = oto_pesel;
    }


    @Override
    public String toString() {
        return "Obywatel z peselem: " + pesel + ", " + super.toString();
    }


    @Override
    public int compareTo(Osoba o) {
        int lastNamesCompare = super.compareTo(o);
        if(lastNamesCompare == 0) {
            if(! (o instanceof Obywatel)) return 1;
            return this.pesel.compareTo(((Obywatel) o).pesel);
        }
        return lastNamesCompare;
    }
}






public class Main {

    public static <T> boolean compareStrings(T o1, T o2, T o3) {
        return o1.toString().equals(o2.toString()) && o2.toString().equals(o3.toString());
    }

    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Kowalski");
        Osoba osoba2 = new Osoba("Kowalski");
        Osoba osoba3 = new Osoba("Kowalski");
        Osoba osoba4 = new Osoba("Nowak");

        Obywatel obywatel1 = new Obywatel("Nowak", "123");
        Obywatel obywatel2 = new Obywatel("Nowak", "999");

        System.out.println(osoba1); //implicit toString
        System.out.println(obywatel1);
        System.out.println(obywatel2);

        System.out.println(compareStrings(osoba1, obywatel1, obywatel2));
        System.out.println(compareStrings(osoba1, osoba2, osoba3));
        System.out.println(osoba4.compareTo(obywatel1));
        System.out.println(obywatel1.compareTo(osoba4));
        System.out.println(obywatel1.compareTo(obywatel2));


    }
}
