package musicalInstruments;

import melody.Melody;

public class Trombone extends WindInstruments {
    private Melody tromboneMelody = new Melody("Bo-boo-bo-bo");

    public Trombone(String name){
        super(name);
    }

    @Override
    public void information(String name, Melody melody) {
        this.tromboneMelody.setMelody(melody.getMelody());
        this.setTone(10);
        System.out.println("This trombon name - " + this.getName() + ". Playing " + tromboneMelody.getMelody()
                + ". And tone is equal " + this.getTone());
    }

    @Override
    public void description() {
        System.out.println("You can play: " + tromboneMelody.getMelody());
    }
}
