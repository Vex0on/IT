package pl.imiajd.Sosnowski;

import java.time.LocalDate;

public class Flet extends Instrument {
    public Flet(String producent, LocalDate rokProdukcji){
        super(producent, rokProdukcji);
    }

    public String dzwiek() {
        return "fiu fiu fiu firiri riri";
    }
}
