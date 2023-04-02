package lesson1.obstances;

import lesson1.animals.Animal;
import lesson1.animals.Jumpable;

public class Wall implements Let {
    private final float height;

    public Wall(float height) {
        this.height = height;
    }
    @Override
    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }
    public float getHeight(){
        return height;
    }
}
