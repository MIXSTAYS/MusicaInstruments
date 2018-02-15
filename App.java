import melody.Melody;
import musicalInstruments.Drums;
import musicalInstruments.Guitar;
import musicalInstruments.Trombone;

public class App {
    public static void main(String[] args) {

        Melody melody = new Melody("song");

        Guitar guitar = new Guitar("Salaga");
        guitar.description();
        guitar.information(guitar.getName(), melody);

        Trombone trombone = new Trombone("Spooody");
        trombone.description();
        trombone.information(trombone.getName(), melody);

        Drums drums = new Drums("Barabani", "Zhelezo");
        drums.description();
        drums.information(drums.getName(), melody);
    }
}
