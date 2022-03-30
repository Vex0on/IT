package pl.imiajd.Sosnowski;

import java.time.LocalDate;

public abstract class Instrument {

    private final String producent;
    private final LocalDate rokProdukcji;

    public Instrument(String producent, LocalDate rokProdukcji) {
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getRokProdukcji() {
        return rokProdukcji;
    }

    public abstract String dzwiek();

    @Override
    public String toString(){
        return "\n" +  "Nazwa producenta: " + this.getProducent() + "\n" + "Rok produkcji: " + this.getRokProdukcji() + "\n" + "Nazwa instrumentu: " +this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object eq){
        return this.toString().equals(eq.toString());
    }

}