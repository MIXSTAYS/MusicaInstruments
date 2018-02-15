package musicalInstruments;

import melody.Melody;

public class Drums extends PercussionInstruments{
    private Melody drumsBit = new Melody("Bom-bom-bam!");

    public Drums(String name, String material){
        super(name, material);
    }

    @Override
    public void information(String name, Melody melody) {
        this.drumsBit.setMelody(melody.getMelody());
        System.out.println("This drums name - " + this.getName() + ". Playing " + drumsBit.getMelody()
                + ". Material - " + this.getMaterial());
    }
    @Override
    public void description() {
        System.out.println("You can play: " + drumsBit.getMelody());
    }
}
