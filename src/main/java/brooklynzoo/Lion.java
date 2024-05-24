package brooklynzoo;

public class Lion extends Animal implements Eats, Runs{
    @Override
    public String toString() {
        return "Lion{}";
    }

    @Override
    public void eats() {
        System.out.println("people");
    }

    @Override
    public void runs() {
        System.out.println("run wild");
    }
}
