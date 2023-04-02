package lesson1.obstances;

import lesson1.animals.Animal;
import lesson1.animals.Swimable;

public class Water implements Let {

    private final int length;

    public Water(int length) {
        this.length = length;
    }
    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Swimable)
            return ((Swimable) animal).swim(length);
        else
            return false;
    }
    public int getLength(){
        return length;
    }
}
