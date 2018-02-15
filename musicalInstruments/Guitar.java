package musicalInstruments;

import melody.Melody;

public class Guitar extends StringedInstruments {
    private Melody guitarMelody = new Melody("Brenk-brenk"); // Инкапусляция

    public Guitar (String name){
        super(name);
    } //Наследование

    @Override
    public void information(String name, Melody melody) {  // Полиморфизм
        this.guitarMelody.setMelody(melody.getMelody());
        setNumberOfStrings(5);
        System.out.println("This guitar name - " + name + ". Playing " + guitarMelody.getMelody()
                + " by " + getNumberOfStrings() + " strings." );
    }
    @Override
    public void description() {
        System.out.println("You can play: " + guitarMelody.getMelody());
    }

}
