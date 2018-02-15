package musicalInstruments;

import melody.Melody;

abstract class StringedInstruments implements MusicalInstruments {
    private int numberOfStrings; // Encapsulation
    private String name;

    public StringedInstruments(String name){
        this.name = name;
    }

    public abstract void information(String name, Melody melody); // Inheritance

    public abstract void description();

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
