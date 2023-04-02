package lesson1.animals;

public class Hippo extends Animal implements Swimable {
    private int swim_limit;

    public Hippo(String name) {
        this.name = name;
        int RUN_LIMIT = 50;
        this.run_limit = RUN_LIMIT;
        int SWIM_LIMIT = 200;
        swim_limit = SWIM_LIMIT;
    }
    public Hippo(String name, int run_limit, int swim_limit) {
        this.name = name;
        this.run_limit = run_limit;
        swim_limit = swim_limit;
    }

    @Override
    public String voice() {
        return "хрррр";
    }

    @Override
    public boolean swim(int length) {
        return swim_limit >= length;
    }
    @Override
    public int getSwimLimit(){
        return swim_limit;
    }
}