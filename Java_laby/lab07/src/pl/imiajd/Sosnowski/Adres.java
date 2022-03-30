package pl.imiajd.Sosnowski;

class Adres {

    private static String ulica;
    private static String numer_domu;
    private static String numer_mieszkania;
    private static String miasto;
    private static String kod_pocztowy;

    public Adres(String ulica,String  numer_domu,String numer_mieszkania,String miasto,String kod_pocztowy) {
        Adres.ulica = ulica;
        Adres.numer_domu = numer_domu;
        Adres.numer_mieszkania = numer_mieszkania;
        Adres.miasto = miasto;
        Adres.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica,String  numer_domu,String miasto,String kod_pocztowy){
        Adres.ulica = ulica;
        Adres.numer_domu = numer_domu;
        Adres.miasto = miasto;
        Adres.kod_pocztowy = kod_pocztowy;
    }

    public static void pokaz(int adres){
        if (adres == 1)
        {
            Adres Obj = new Adres("Kosciuszki", "13", "5", "Olsztyn", "10-350");
            System.out.println(Obj.kod_pocztowy + " " + Obj.miasto);
            System.out.println(Obj.ulica + " " + Obj.numer_domu + "/" + Obj.numer_mieszkania);
            System.out.println();
        }
        else if (adres == 2)
        {
            Adres Obj = new Adres("Popieluszki", "8", "Wroclaw", "50-102");
            System.out.println(Obj.kod_pocztowy + " " + Obj.miasto);
            System.out.println(Obj.ulica + " " + Obj.numer_domu + "/" + Obj.numer_mieszkania);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pokaz(1);
        pokaz(2);
    }
}
