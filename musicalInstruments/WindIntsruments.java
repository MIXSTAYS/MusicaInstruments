package musicalInstruments;

import melody.Melody;

abstract class WindIntsruments implements MusicalInstruments {
    private int tone;
    private String name;

    public WindIntsruments(String name){
        this.name = name;
    }

    public abstract void information(String name, Melody melody);
    public abstract void description();

    public int getTone() {
        return tone;
    }
    public void setTone(int tone) {
        this.tone = tone;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
