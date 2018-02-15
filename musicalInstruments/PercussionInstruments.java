package musicalInstruments;

import melody.Melody;

abstract class PercussionInstruments {
    private String material;
    private String name;

    public PercussionInstruments(String name, String material){
        this.name = name;
        this.material = material;
    }

    public abstract void information(String name, Melody melody);
    public abstract void description();

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

