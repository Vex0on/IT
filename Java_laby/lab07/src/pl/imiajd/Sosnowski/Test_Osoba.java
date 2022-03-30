package pl.imiajd.Sosnowski;

public class Test_Osoba {
    public static void main(String[] args) {
        Student Krzysiek = new Student("Pataszewski", "06.11.2000", "Informatyka");
        Nauczyciel Wladyslaw = new Nauczyciel("Kataszkiewicz", "23.05.1974", 3400);
        System.out.println(Krzysiek);
        System.out.println();
        System.out.println(Wladyslaw);
    }
}
