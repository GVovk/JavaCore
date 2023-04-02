package lesson1.obstances;

import lesson1.animals.Animal;

public class Track implements Let {
    private final int length;

    public Track(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Animal animal) {
        return animal.run(length);
    }
    public int getLength(){
        return length;
    }
}
