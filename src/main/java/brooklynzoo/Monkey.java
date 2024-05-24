package brooklynzoo;

public class Monkey extends Animal implements Eats, Runs{

    @Override
    public String toString() {
        return "Monkey{}";
    }

    @Override
    public void eats() {
        System.out.println("bananas");
    }

    @Override
    public void runs() {
        System.out.println("jump and swing");
    }
}
